package main.java.dao;

import main.java.domain.Teacher;
import main.java.domain.Subject;

import java.util.Set;

public interface TeacherDao extends PersonDao<Teacher> {

    Set<Teacher> getByFunction(String function);

    Set<Teacher> getBySubject(Subject subject);
}
