package dao.impl;

import dao.SubjectDao;
import domain.Subject;

import java.util.Set;
import java.util.HashSet;

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
    public Subject save(Subject object) {
        return null;
    }

    @Override
    public Subject update(Subject object) {
        return null;
    }

    @Override
    public Set<Subject> getAll() {
        return new HashSet<>();
    }

    @Override
    public Subject getByName(String name) {
        return null;
    }

    @Override
    public void delete(Subject object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
