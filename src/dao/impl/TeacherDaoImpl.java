package dao.impl;

import dao.TeacherDao;
import domain.Subject;
import domain.Teacher;

public class TeacherDaoImpl implements TeacherDao {

    private static  TeacherDao instance;

    private TeacherDaoImpl() {

    }

    private static TeacherDao getInstance() {
        if (instance == null) {
            instance = new TeacherDaoImpl();
        }
        return instance;
    }

    @Override
    public Teacher[] getByFunction(String function) {
        return new Teacher[0];
    }

    @Override
    public Teacher[] getBySubject(Subject subject) {
        return new Teacher[0];
    }

    @Override
    public Teacher save(Object object) {
        return null;
    }

    @Override
    public Teacher update(Object object) {
        return null;
    }

    @Override
    public Teacher[] getAll() {
        return new Teacher[0];
    }

    @Override
    public Teacher getByName(String name) {
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
