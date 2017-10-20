## Synopsis

This is a simple Java web service that provides REST API access to data stored in a relational database system. The database contains a person table. A person record has a unique identifier and the following additional attributes: *name*, *age*, *date of birth* and *email address*.

## Motivation

Full working REST application sample showcasing my work, and testbed to add/try new features like frameworks, etc.

## Heroku Deployment

Project PeopleFinder added to GitHub:
https://github.com/Steven-Rock/PeopleFinder

It is also deployed to Heroku using PostgreSQL on the backend (links below).

## Endpoints:

https://polar-woodland-58667.herokuapp.com/people
- shows all the people in the person table
[{"id":1,"firstName":"Steven","lastName":"Rock","email":"stevenrock@gmail.com","dob":1508157157415},
{"id":2,"firstName":"Steven","lastName":"Rock","email":"stevenrock@gmail.com","dob":1508157413644}]

https://polar-woodland-58667.herokuapp.com/person/new
- adds test user with new id
{"id":3,"firstName":"Steven","lastName":"Rock","email":"stevenrock@gmail.com","dob":1508159407862}

https://polar-woodland-58667.herokuapp.com/person/3
- finds the user with the specified id
{"id":3,"firstName":"Steven","lastName":"Rock","email":"stevenrock@gmail.com","dob":1508159407862}

https://polar-woodland-58667.herokuapp.com/person/10
- use id not in the database, i.e. user not found throws 404
There was an unexpected error (type=Not Found, status=404).

## TODO:

- [x] Add form to create new users
- [ ] Add login security
- [ ] Add table view to show all persons in the DB
- [ ] Add delete
- [ ] Use React for front end?
