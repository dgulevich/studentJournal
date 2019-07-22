package service;

import domain.Assessment;
import domain.Pupil;
import domain.Subject;
import domain.Teacher;

import java.util.List;

public interface AssessmentService extends GenericService<Assessment> {

    Assessment put(Assessment assessment);

    List<Assessment> getByValue(Integer value);

    List<Assessment> getByPupil(Pupil pupil);

    List<Assessment> getByTeacher(Teacher teacher);

    List<Assessment> getBySybject(Subject subject);
}
