package main.java.service.impl;

import main.java.dao.TeacherDao;
import main.java.dao.impl.TeacherDaoImpl;
import main.java.domain.Subject;
import main.java.domain.Teacher;
import main.java.service.TeacherService;

import java.util.Optional;
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
    public Set<Teacher> getByFunction(String function) {
        return teacherDao.getByFunction(function);
    }

    @Override
    public Set<Teacher> getBySubject(Subject subject) {
        return teacherDao.getBySubject(subject);
    }

    @Override
    public boolean include(Teacher teacher) {
        teacherDao.save(teacher);
        return true;
    }

    @Override
    public boolean exclude(Teacher teacher) {
        teacherDao.delete(teacher);
        return true;
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
    public Set<Teacher> getAll() {
        return teacherDao.getAll();
    }

    @Override
    public Optional<Teacher> getById(Long id) {
        return teacherDao.getById(id);
    }

    @Override
    public void delete(Teacher teacher) {
        teacherDao.delete(teacher);
    }

    @Override
    public void deleteAll() {
        teacherDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        teacherDao.deleteById(id);
    }
}
