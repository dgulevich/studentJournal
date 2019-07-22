package service;

import domain.Subject;
import domain.Teacher;

import java.util.Set;

public interface TeacherService extends PersonService<Teacher> {

    Set<Teacher> getByFunction(String function);

    Set<Teacher> getBySubject(Subject subject);
}
