package main.java.dao;

import main.java.domain.Classroom;
import main.java.domain.Pupil;

import java.util.Optional;
import java.util.Set;

public interface ClassroomDao extends GenericDao<Classroom> {

    Optional<Classroom> getByPupil(Pupil pupil);

    @Override
    Set<Classroom> getAll();
}
