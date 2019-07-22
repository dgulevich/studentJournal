package service.impl;

import dao.PupilDao;
import dao.impl.PupilDaoImpl;
import domain.Classroom;
import domain.Pupil;
import service.PupilService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

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
    public Optional<Pupil> save(Pupil pupil) {
        return pupilDao.save(pupil);
    }

    @Override
    public Optional<Pupil> update(Pupil pupil) {
        return pupilDao.update(pupil);
    }

    @Override
    public boolean cerruit(Pupil person) {
        pupilDao.save(person);
        return true;
    }

    @Override
    public boolean exclude(Pupil person) {
        pupilDao.delete(person);
        return true;
    }

    @Override
    public Set<Pupil> getAll() {
        return pupilDao.getAll();
    }

    @Override
    public Optional<Pupil> getByName(String name) {
        return pupilDao.getByName(name);
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
    public Optional<Pupil> transfer(Pupil pupil, Classroom classTo) {
        return pupilDao.update(pupil);
    }

    @Override
    public Set<Pupil> getByClassroom(Classroom classroom) {
        return pupilDao.getByClassroom(classroom);
    }
}
