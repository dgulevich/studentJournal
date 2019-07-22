package service;

import domain.Classroom;
import domain.Pupil;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface ClassroomService extends GenericService<Classroom> {

    Optional<Classroom> getByPupil(Pupil pupil);

    @Override
    Set<Classroom> getAll();
}
