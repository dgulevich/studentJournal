package dao;

import domain.Teacher;
import domain.Subject;
import java.util.Set;

public interface TeacherDao extends GenericDao<Teacher> {

    Set<Teacher> getByFunction(String function);

    Set<Teacher> getBySubject(Subject subject);
}
