package service;

import domain.Classroom;
import domain.Pupil;

import java.util.Optional;
import java.util.Set;

public interface PupilService extends PersonService<Pupil> {

    Optional<Pupil> transfer(Pupil pupil, Classroom classTo);

    Set<Pupil> getByClassroom(Classroom classroom);
}
