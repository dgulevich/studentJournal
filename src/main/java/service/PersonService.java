package main.java.service;

import main.java.domain.Person;

import java.util.Set;

public interface PersonService<T extends Person> extends GenericService<T> {

    boolean include(T person);

    boolean exclude(T person);

    @Override
    Set<T> getAll();
}
