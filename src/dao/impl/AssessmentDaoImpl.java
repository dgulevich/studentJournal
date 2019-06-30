package dao.impl;

import dao.AssessmentDao;
import domain.Assessment;
import domain.Pupil;
import domain.Subject;
import domain.Teacher;

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
    public Assessment[] getByValue(Integer value) {
        return new Assessment[0];
    }

    @Override
    public Assessment[] getByPupil(Pupil pupil) {
        return new Assessment[0];
    }

    @Override
    public Assessment[] getByTeacher(Teacher teacher) {
        return new Assessment[0];
    }

    @Override
    public Assessment[] getBySybject(Subject subject) {
        return new Assessment[0];
    }

    @Override
    public Assessment save(Object object) {
        return null;
    }

    @Override
    public Assessment update(Object object) {
        return null;
    }

    @Override
    public Assessment[] getAll() {
        return new Assessment[0];
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
