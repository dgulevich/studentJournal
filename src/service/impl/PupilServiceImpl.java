package service.impl;

import dao.PupilDao;
import dao.impl.PupilDaoImpl;
import domain.Classroom;
import domain.Pupil;
import service.PupilService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PupilServiceImpl implements PupilService {

    private static PupilService instance;

    private PupilDao pupilDao = PupilDaoImpl.getInstance();

    private PupilServiceImpl() {

    }

    public static PupilService getInstance() {
        if (instance == null) {
            instance = new PupilServiceImpl();
        }
        return instance;
    }

    @Override
    public Pupil save(Pupil pupil) {
        return null;
    }

    @Override
    public Pupil update(Pupil pupil) {
        return null;
    }

    @Override
    public boolean cerruit(Pupil person) {
        return false;
    }

    @Override
    public boolean exclude(Pupil person) {
        return false;
    }

    @Override
    public Set<Pupil> getAll() {
        return new HashSet<>();
    }

    @Override
    public Pupil getByName(String name) {
        return null;
    }

    @Override
    public void delete(Pupil pupil) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public boolean transfer(Pupil pupil, Classroom classTo) {
        return false;
    }

    @Override
    public Set<Pupil> getByClassroom(Classroom classroom) {
        return new HashSet<>();
    }
}
