package main.java.dao;

import main.java.domain.Assessment;
import main.java.domain.Pupil;
import main.java.domain.Subject;
import main.java.domain.Teacher;
import java.util.List;
import java.util.Optional;

public interface AssessmentDao extends GenericDao<Assessment> {

    List<Assessment> getByValue(Integer value);

    List<Assessment> getByPupil(Pupil pupil);

    List<Assessment> getByTeacher(Teacher teacher);

    List<Assessment> getBySubject(Subject subject);
}
