package dao.impl;

import dao.ClassroomDao;
import domain.Classroom;
import domain.Pupil;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class ClassroomDaoImpl implements ClassroomDao {

    private static ClassroomDao instance;

    private ClassroomDaoImpl() {

    }

    public static ClassroomDao getInstance() {
        if (instance == null) {
            instance = new ClassroomDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Classroom> getByPupil(Pupil pupil) {
        return empty();
    }

    @Override
    public Optional<Classroom> save(Classroom object) {
        return empty();
    }

    @Override
    public Optional<Classroom> update(Classroom object) {
        return empty();
    }

    @Override
    public Set<Classroom> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Classroom> getByName(String name) {
        return empty();
    }

    @Override
    public void delete(Classroom object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
