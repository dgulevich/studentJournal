package service.impl;

import dao.AssessmentDao;
import dao.impl.AssessmentDaoImpl;
import domain.Assessment;
import domain.Pupil;
import domain.Subject;
import domain.Teacher;
import service.AssessmentService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

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
    public Assessment save(Assessment assessment) {
        return null;
    }

    @Override
    public Assessment update(Assessment assessment) {
        return null;
    }

    @Override
    public List<Assessment> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Assessment getByName(String name) {
        return null;
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
    public Assessment put(Assessment assessment) {
        return null;
    }

    @Override
    public List<Assessment> getByValue(Integer value) {
        return new ArrayList<>();
    }

    @Override
    public List<Assessment> getByPupil(Pupil pupil) {
        return new ArrayList<>();
    }

    @Override
    public List<Assessment> getByTeacher(Teacher teacher) {
        return new ArrayList<>();
    }

    @Override
    public List<Assessment> getBySybject(Subject subject) {
        return new ArrayList<>();
    }
}
