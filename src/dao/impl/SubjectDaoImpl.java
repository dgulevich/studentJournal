package dao.impl;

import dao.SubjectDao;
import domain.Subject;

import java.util.Optional;
import java.util.Set;
import java.util.HashSet;

import static java.util.Optional.empty;

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
    public Optional<Subject> save(Subject object) {
        return empty();
    }

    @Override
    public Optional<Subject> update(Subject object) {
        return empty();
    }

    @Override
    public Set<Subject> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Subject> getByName(String name) {
        return empty();
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
