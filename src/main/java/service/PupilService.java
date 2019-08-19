package main.java.service;

import main.java.domain.Classroom;
import main.java.domain.Pupil;

import java.util.Optional;
import java.util.Set;

public interface PupilService extends PersonService<Pupil> {

    Optional<Pupil> transfer(Pupil pupil, Classroom classTo);

    Set<Pupil> getByClassroom(Classroom classroom);
}
