package dao;

import domain.Pupil;
import domain.Classroom;

public interface PupilDao extends GenericDao {

    Pupil[] getByClassroom(Classroom classroom);
}
