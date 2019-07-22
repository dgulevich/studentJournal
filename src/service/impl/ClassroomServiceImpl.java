package service.impl;

import dao.ClassroomDao;
import dao.impl.ClassroomDaoImpl;
import domain.Classroom;
import domain.Pupil;
import service.ClassroomService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

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

    @Override
    public Optional<Classroom> getByName(String name) {
        return classroomDao.getByName(name);
    }

    @Override
    public void delete(Classroom classroom) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public Optional<Classroom> getByPupil(Pupil pupil) {
        return classroomDao.getByPupil(pupil);
    }
}
