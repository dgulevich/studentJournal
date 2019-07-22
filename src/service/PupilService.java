package service;

import domain.Classroom;
import domain.Pupil;

import java.util.Set;

public interface PupilService extends PersonService<Pupil> {

    boolean transfer(Pupil pupil, Classroom classTo);

    Set<Pupil> getByClassroom(Classroom classroom);
}
