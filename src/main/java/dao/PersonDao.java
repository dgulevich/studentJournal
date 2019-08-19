package main.java.dao;

import main.java.domain.Person;

import java.util.Set;

public interface PersonDao<T extends Person> extends GenericDao<T> {
    @Override
    Set<T> getAll();
}
