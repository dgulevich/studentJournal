package main.java.dao;

import main.java.domain.Pupil;
import main.java.domain.Classroom;
import java.util.Set;

public interface PupilDao extends PersonDao<Pupil> {

    Set<Pupil> getByClassroom(Classroom classroom);
}
