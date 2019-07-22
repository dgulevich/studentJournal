package service;

import domain.Assessment;
import domain.Pupil;
import domain.Subject;
import domain.Teacher;

import java.util.List;
import java.util.Optional;

public interface AssessmentService extends GenericService<Assessment> {

    Optional<Assessment> put(Assessment assessment);

    List<Assessment> getByValue(Integer value);

    List<Assessment> getByPupil(Pupil pupil);

    List<Assessment> getByTeacher(Teacher teacher);

    List<Assessment> getBySubject(Subject subject);
}
