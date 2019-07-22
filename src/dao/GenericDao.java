package dao;

import java.util.Collection;

public interface GenericDao<T> {

    T save(T object);

    T update(T object);

    Collection<T> getAll();

    T getByName(String name);

    void delete(T object);

    void deleteAll();

    void deleteByName(String name);
}
