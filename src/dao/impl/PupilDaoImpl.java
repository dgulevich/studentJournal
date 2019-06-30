package dao.impl;

import dao.PupilDao;
import domain.Classroom;
import domain.Pupil;

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
    public Pupil[] getByClassroom(Classroom classroom) {
        return new Pupil[0];
    }

    @Override
    public Pupil save(Object object) {
        return null;
    }

    @Override
    public Pupil update(Object object) {
        return null;
    }

    @Override
    public Pupil[] getAll() {
        return new Pupil[0];
    }

    @Override
    public Pupil getByName(String name) {
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
