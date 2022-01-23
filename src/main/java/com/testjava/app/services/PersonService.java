package com.testjava.app.services;

import com.testjava.app.exceptions.handler.NotFoundException;
import com.testjava.app.model.Person;

import java.util.Optional;

public interface PersonService{

    Person save(Person person);
    Iterable<Person> getAll();
    Person update(Person person, Long id) throws NotFoundException;
    Optional<Person> delete(Long id);
}
