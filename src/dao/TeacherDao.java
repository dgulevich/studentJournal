package dao;

import domain.Teacher;
import domain.Subject;

public interface TeacherDao extends GenericDao {

    Teacher[] getByFunction(String function);

    Teacher[] getBySubject(Subject subject);
}
