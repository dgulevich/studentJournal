package service.impl;

import dao.AssessmentDao;
import dao.impl.AssessmentDaoImpl;
import domain.Assessment;
import domain.Pupil;
import domain.Subject;
import domain.Teacher;
import service.AssessmentService;

import java.util.*;

import static java.util.Optional.empty;


public class AssessmentServiceImpl implements AssessmentService {

    private static AssessmentService instance;

    private AssessmentDao assessmentDao = AssessmentDaoImpl.getInstance();

    private AssessmentServiceImpl() {

    }

    public static AssessmentService getInstance() {
        if (instance == null) {
            instance = new AssessmentServiceImpl();
        }
        return instance;
    }

    @Override
    public Optional<Assessment> save(Assessment assessment) {
        return assessmentDao.save(assessment);
    }

    @Override
    public Optional<Assessment> update(Assessment assessment) {
        return assessmentDao.update(assessment);
    }

    @Override
    public Collection<Assessment> getAll() {
        return assessmentDao.getAll();
    }

    @Override
    public Optional<Assessment> getByName(String name) {
        return assessmentDao.getByName(name);
    }

    @Override
    public void delete(Assessment assessment) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public Optional<Assessment> put(Assessment assessment) {
        return assessmentDao.update(assessment);
    }

    @Override
    public List<Assessment> getByValue(Integer value) {
        return assessmentDao.getByValue(value);
    }

    @Override
    public List<Assessment> getByPupil(Pupil pupil) {
        return assessmentDao.getByPupil(pupil);
    }

    @Override
    public List<Assessment> getByTeacher(Teacher teacher) {
        return assessmentDao.getByTeacher(teacher);
    }

    @Override
    public List<Assessment> getBySubject(Subject subject) {
        return assessmentDao.getBySubject(subject);
    }
}
