package dao;

import domain.Assessment;
import domain.Pupil;
import domain.Subject;
import domain.Teacher;

public interface AssessmentDao {

    Assessment[] getByValue(Integer value);

    Assessment[] getByPupil(Pupil pupil);

    Assessment[] getByTeacher(Teacher teacher);

    Assessment[] getBySybject(Subject subject);

    Object save(Object object);

    Object update(Object object);

    Object[] getAll();

    void delete(Object object);

    void deleteAll();

    void deleteByName(String name);
}
