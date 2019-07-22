package service.impl;

import dao.TeacherDao;
import dao.impl.TeacherDaoImpl;
import domain.Subject;
import domain.Teacher;
import service.TeacherService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TeacherServiceImpl implements TeacherService {

    private static TeacherService instance;

    private TeacherDao teacherDao = TeacherDaoImpl.getInstance();

    private TeacherServiceImpl() {

    }

    public static TeacherService getInstance() {
        if (instance == null) {
            instance = new TeacherServiceImpl();
        }
        return instance;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher update(Teacher teacher) {
        return null;
    }

    @Override
    public boolean cerruit(Teacher teacher) {
        return false;
    }

    @Override
    public boolean exclude(Teacher teacher) {
        return false;
    }

    @Override
    public Set<Teacher> getAll() {
        return new HashSet<>();
    }

    @Override
    public Teacher getByName(String name) {
        return null;
    }

    @Override
    public void delete(Teacher teacher) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public Set<Teacher> getByFunction(String function) {
        return new HashSet<>();
    }

    @Override
    public Set<Teacher> getBySubject(Subject subject) {
        return new HashSet<>();
    }
}
