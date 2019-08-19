package main.java.service;

import main.java.domain.Subject;
import main.java.domain.Teacher;

import java.util.Set;

public interface TeacherService extends PersonService<Teacher> {

    Set<Teacher> getByFunction(String function);

    Set<Teacher> getBySubject(Subject subject);
}
