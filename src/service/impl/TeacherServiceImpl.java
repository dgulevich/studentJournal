package service.impl;

import dao.TeacherDao;
import dao.impl.TeacherDaoImpl;
import domain.Subject;
import domain.Teacher;
import service.TeacherService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

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
    public Optional<Teacher> save(Teacher teacher) {
        return teacherDao.save(teacher);
    }

    @Override
    public Optional<Teacher> update(Teacher teacher) {
        return teacherDao.update(teacher);
    }

    @Override
    public boolean cerruit(Teacher teacher) {
        teacherDao.save(teacher);
        return true;
    }

    @Override
    public boolean exclude(Teacher teacher) {
        teacherDao.delete(teacher);
        return true;
    }

    @Override
    public Set<Teacher> getAll() {
        return teacherDao.getAll();
    }

    @Override
    public Optional<Teacher> getByName(String name) {
        return teacherDao.getByName(name);
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
        return teacherDao.getByFunction(function);
    }

    @Override
    public Set<Teacher> getBySubject(Subject subject) {
        return teacherDao.getBySubject(subject);
    }
}
