package dao.impl;

import dao.TeacherDao;
import domain.Subject;
import domain.Teacher;

import java.util.Optional;
import java.util.Set;
import java.util.HashSet;

import static java.util.Optional.empty;


public class TeacherDaoImpl implements TeacherDao {

    private static  TeacherDao instance;

    private TeacherDaoImpl() {

    }

    public static TeacherDao getInstance() {
        if (instance == null) {
            instance = new TeacherDaoImpl();
        }
        return instance;
    }

    @Override
    public Set<Teacher> getByFunction(String function) {
        return new HashSet<>();
    }

    @Override
    public Set<Teacher> getBySubject(Subject subject) {
        return new HashSet<>();
    }

    @Override
    public Optional<Teacher> save(Teacher object) {
        return empty();
    }

    @Override
    public Optional<Teacher> update(Teacher object) {
        return empty();
    }

    @Override
    public Set<Teacher> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Teacher> getByName(String name) {
        return empty();
    }

    @Override
    public void delete(Teacher object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
