package dao;

import domain.Classroom;
import domain.Pupil;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface ClassroomDao extends GenericDao<Classroom> {

    Optional<Classroom> getByPupil(Pupil pupil);

    @Override
    Set<Classroom> getAll();
}
