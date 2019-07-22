package dao.impl;

import dao.PupilDao;
import domain.Classroom;
import domain.Pupil;

import java.util.Optional;
import java.util.Set;
import java.util.HashSet;

import static java.util.Optional.empty;

public class PupilDaoImpl implements PupilDao {

    private static PupilDao instance;

    private PupilDaoImpl() {

    }

    public static PupilDao getInstance() {
        if (instance == null) {
            instance = new PupilDaoImpl();
        }
        return instance;
    }

    @Override
    public Set<Pupil> getByClassroom(Classroom classroom) {
        return new HashSet<>();
    }

    @Override
    public Optional<Pupil> save(Pupil object) {
        return empty();
    }

    @Override
    public Optional<Pupil> update(Pupil object) {
        return empty();
    }

    @Override
    public Set<Pupil> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Pupil> getByName(String name) {
        return empty();
    }

    @Override
    public void delete(Pupil object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
