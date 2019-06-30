package dao;

public interface GenericDao {

    Object save(Object object);

    Object update(Object object);

    Object[] getAll();

    Object getByName(String name);

    void delete(Object object);

    void deleteAll();

    void deleteByName(String name);
}
