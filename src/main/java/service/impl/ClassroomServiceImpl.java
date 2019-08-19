package main.java.service.impl;

import main.java.dao.ClassroomDao;
import main.java.dao.impl.ClassroomDaoImpl;
import main.java.domain.Classroom;
import main.java.domain.Pupil;
import main.java.service.ClassroomService;

import java.util.Optional;
import java.util.Set;

public class ClassroomServiceImpl implements ClassroomService {

    private static ClassroomService instance;

    private ClassroomDao classroomDao = ClassroomDaoImpl.getInstance();

    private ClassroomServiceImpl() {

    }

    public static ClassroomService getInstance() {
        if (instance == null) {
            instance = new ClassroomServiceImpl();
        }
        return instance;
    }

    @Override
    public Optional<Classroom> save(Classroom classroom) {
        return classroomDao.save(classroom);
    }

    @Override
    public Optional<Classroom> update(Classroom classroom) {
        return classroomDao.update(classroom);
    }

    @Override
    public Set<Classroom> getAll() {
        return classroomDao.getAll();
    }

    public Optional<Classroom> getById(Long id) {
        return classroomDao.getById(id);
    }

    @Override
    public void delete(Classroom classroom) {
        classroomDao.delete(classroom);
    }

    @Override
    public void deleteAll() {
        classroomDao.deleteAll();
    }

    public void deleteById(Long id) {
        classroomDao.deleteById(id);
    }

    @Override
    public Optional<Classroom> getByPupil(Pupil pupil) {
        return classroomDao.getByPupil(pupil);
    }
}
