package dao.impl;

import dao.SubjectDao;
import domain.Subject;

public class SubjectDaoImpl implements SubjectDao {

    private static SubjectDao instance;

    private SubjectDaoImpl(){

    }

    public static SubjectDao getInstance() {
        if (instance == null) {
            instance = new SubjectDaoImpl();
        }
        return instance;
    }

    @Override
    public Subject save(Object object) {
        return null;
    }

    @Override
    public Subject update(Object object) {
        return null;
    }

    @Override
    public Subject[] getAll() {
        return new Subject[0];
    }

    @Override
    public Subject getByName(String name) {
        return null;
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
