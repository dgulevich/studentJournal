package dao;

import java.util.Collection;
import java.util.Optional;

public interface GenericDao<T> {

    Optional<T> save(T object);

    Optional<T> update(T object);

    Collection<T> getAll();

    Optional<T> getByName(String name);

    void delete(T object);

    void deleteAll();

    void deleteByName(String name);
}
