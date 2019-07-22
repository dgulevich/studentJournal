package service;

import domain.Classroom;
import domain.Pupil;

public interface ClassroomService extends GenericService<Classroom> {

    Classroom getByPupil(Pupil pupil);
}
