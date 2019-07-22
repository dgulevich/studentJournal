package dao;

import domain.Pupil;
import domain.Classroom;
import java.util.Set;

public interface PupilDao extends GenericDao<Pupil> {

    Set<Pupil> getByClassroom(Classroom classroom);
}
