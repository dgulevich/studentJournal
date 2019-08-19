package main.java.service;

import main.java.domain.Classroom;
import main.java.domain.Pupil;

import java.util.Optional;
import java.util.Set;

public interface ClassroomService extends GenericService<Classroom> {

    Optional<Classroom> getByPupil(Pupil pupil);

    @Override
    Set<Classroom> getAll();
}
