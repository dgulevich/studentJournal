package main.java.service.impl;

import main.java.dao.AssessmentDao;
import main.java.dao.impl.AssessmentDaoImpl;
import main.java.domain.Assessment;
import main.java.domain.Pupil;
import main.java.domain.Subject;
import main.java.domain.Teacher;
import main.java.service.AssessmentService;

import java.util.*;


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
    public Optional<Assessment> put(Assessment assessment) {
        return assessmentDao.save(assessment);
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
    public Optional<Assessment> getById(Long id) {
        return assessmentDao.getById(id);
    }

    @Override
    public void delete(Assessment assessment) {
        assessmentDao.delete(assessment);
    }

    @Override
    public void deleteAll() {
        assessmentDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        assessmentDao.deleteById(id);
    }
}
