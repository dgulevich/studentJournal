package dao.impl;

import dao.ClassroomDao;
import domain.Classroom;
import domain.Pupil;

import java.util.HashSet;
import java.util.Set;

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
    public Classroom save(Classroom object) {
        return null;
    }

    @Override
    public Classroom update(Classroom object) {
        return null;
    }

    @Override
    public Set<Classroom> getAll() {
        return new HashSet<>();
    }

    @Override
    public Classroom getByName(String name) {
        return null;
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
