package service.impl;

import dao.ClassroomDao;
import dao.impl.ClassroomDaoImpl;
import domain.Classroom;
import domain.Pupil;
import service.ClassroomService;

import java.util.Collection;
import java.util.HashSet;
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

    @Override
    public Classroom getByPupil(Pupil pupil) {
        return null;
    }
}
