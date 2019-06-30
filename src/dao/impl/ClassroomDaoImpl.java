package dao.impl;

import dao.ClassroomDao;
import domain.Classroom;
import domain.Pupil;

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
    public Classroom getByPupil(Pupil pupil) {
        return null;
    }

    @Override
    public Classroom save(Object object) {
        return null;
    }

    @Override
    public Classroom update(Object object) {
        return null;
    }

    @Override
    public Classroom[] getAll() {
        return new Classroom[0];
    }

    @Override
    public Classroom getByName(String name) {
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
