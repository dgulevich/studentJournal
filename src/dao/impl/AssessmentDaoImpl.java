package dao.impl;

import dao.AssessmentDao;
import domain.Assessment;
import domain.Pupil;
import domain.Subject;
import domain.Teacher;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;

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
    public List<Assessment> getBySubject(Subject subject) {
        return new ArrayList<>();
    }

    @Override
    public Optional<Assessment> save(Assessment object) {
        return empty();
    }

    @Override
    public Optional<Assessment> update(Assessment object) {
        return empty();
    }

    @Override
    public List<Assessment> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Assessment> getByName(String name) { return empty(); }

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
