package dao;

import domain.Classroom;
import domain.Pupil;

public interface ClassroomDao extends GenericDao {

    Classroom getByPupil(Pupil pupil);
}
