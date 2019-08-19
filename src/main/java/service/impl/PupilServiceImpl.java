package main.java.service.impl;

import main.java.dao.PupilDao;
import main.java.dao.impl.PupilDaoImpl;
import main.java.domain.Classroom;
import main.java.domain.Pupil;
import main.java.service.PupilService;

import java.util.HashSet;
import java.util.Optional;
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
    public Optional<Pupil> transfer(Pupil pupil, Classroom classTo) {
        pupil.setClassroom(classTo);
        return pupilDao.update(pupil);
    }

    @Override
    public Set<Pupil> getByClassroom(Classroom classroom) {
        return pupilDao.getByClassroom(classroom);
    }

    @Override
    public boolean include(Pupil pupil) {
        pupilDao.save(pupil);
        return true;
    }

    @Override
    public boolean exclude(Pupil pupil) {
        pupilDao.delete(pupil);
        return true;
    }

    @Override
    public Optional<Pupil> save(Pupil pupil) {
        return pupilDao.save(pupil);
    }

    @Override
    public Optional<Pupil> update(Pupil pupil) {
        return pupilDao.update(pupil);
    }

    @Override
    public Set<Pupil> getAll() {
        return pupilDao.getAll();
    }

    @Override
    public Optional<Pupil> getById(Long id) {
        return pupilDao.getById(id);
    }

    @Override
    public void delete(Pupil pupil) {
        pupilDao.delete(pupil);
    }

    @Override
    public void deleteAll() {
        pupilDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        pupilDao.deleteById(id);
    }
}
