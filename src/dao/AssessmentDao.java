package dao;

import domain.Assessment;
import domain.Pupil;
import domain.Subject;
import domain.Teacher;
import java.util.List;

public interface AssessmentDao extends GenericDao<Assessment> {

    List<Assessment> getByValue(Integer value);

    List<Assessment> getByPupil(Pupil pupil);

    List<Assessment> getByTeacher(Teacher teacher);

    List<Assessment> getBySubject(Subject subject);
}
