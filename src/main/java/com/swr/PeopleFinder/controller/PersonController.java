package com.swr.PeopleFinder.controller;

import com.swr.PeopleFinder.model.Person;
import com.swr.PeopleFinder.repo.PersonRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class PersonController {


    private PersonRepository repository;

    @Autowired
    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
    public Person hello(){

        System.out.println("Hello");

        Person p = new Person("Hello", "Hello", new Date() , "Hello@gmail.com");
        return p;
    }

    @RequestMapping(value="/people", method=RequestMethod.GET)
    @ResponseBody
    public Iterable<Person> getCustomers(){

        System.out.println("Searching for all users");
        return repository.findAll();
    }

    @RequestMapping(value="/person/new", method=RequestMethod.GET)
    @ResponseBody
    public Person createCustomer(){

        System.out.println("Creating user Mike");
        Person p = new Person("Steven", "Rock", new Date() , "stevenrock@gmail.com");
        repository.save(p);

        System.out.println("Searching for all users");

        return repository.findOne(1L);
    }

    @RequestMapping(value="/person/{id}", method=RequestMethod.GET)
    public Person getPerson(@PathVariable long id) throws NotFoundException {
        System.out.println("Searching for user id " + id);

        Person p2 = repository.findOne(id);
        if(p2 != null ){
            System.out.println("Found user " + p2.toString());
        }
        else{
            System.out.println("Did not find user");
            throw new NotFoundException("Not able to find user with id = " + id);
        }

        return p2;
    }

}
