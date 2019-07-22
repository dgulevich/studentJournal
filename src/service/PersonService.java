package service;

import domain.Person;

import java.util.Set;

public interface PersonService<T extends Person> extends GenericService<T> {

    boolean cerruit(T person);

    boolean exclude(T person);

    @Override
    Set<T> getAll();
}
