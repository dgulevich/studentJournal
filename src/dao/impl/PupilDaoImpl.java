package dao.impl;

import dao.PupilDao;
import domain.Classroom;
import domain.Pupil;

import java.util.Set;
import java.util.HashSet;

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
    public Pupil save(Pupil object) {
        return null;
    }

    @Override
    public Pupil update(Pupil object) {
        return null;
    }

    @Override
    public Set<Pupil> getAll() {
        return new HashSet<>();
    }

    @Override
    public Pupil getByName(String name) {
        return null;
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
