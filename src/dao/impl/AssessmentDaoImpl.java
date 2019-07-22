package dao.impl;

import dao.AssessmentDao;
import domain.Assessment;
import domain.Pupil;
import domain.Subject;
import domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class AssessmentDaoImpl implements AssessmentDao {

    private static AssessmentDao instance;

    private AssessmentDaoImpl() {

    }

    public static AssessmentDao getInstance() {
        if (instance == null) {
            instance = new AssessmentDaoImpl();
        }
        return instance;
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

    @Override
    public Assessment save(Assessment object) {
        return null;
    }

    @Override
    public Assessment update(Assessment object) {
        return null;
    }

    @Override
    public List<Assessment> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Assessment getByName(String name) { return null; }

    @Override
    public void delete(Assessment object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
