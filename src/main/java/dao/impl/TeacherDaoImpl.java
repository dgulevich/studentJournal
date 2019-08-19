package main.java.dao.impl;

import main.java.dao.TeacherDao;
import main.java.domain.Subject;
import main.java.domain.Teacher;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Optional.empty;


public class TeacherDaoImpl extends GenericDaoImpl<Teacher> implements TeacherDao {

    private static  TeacherDao instance;

    private TeacherDaoImpl() {
        super(Teacher.class, (o) -> {
            Teacher teacher = null;
            if (o instanceof Teacher) {
                teacher = (Teacher) o;
            }
            return teacher;
        });
    }

    public static TeacherDao getInstance() {
        if (instance == null) {
            instance = new TeacherDaoImpl();
        }
        return instance;
    }

    @Override
    public Set<Teacher> getByFunction(String function) {
        return new HashSet<>(super.getAll().stream()
                .filter((o) -> o.getFunction().equals(function))
                .collect(Collectors.toSet()));
    }

    @Override
    public Set<Teacher> getBySubject(Subject subject) {
        return new HashSet<>(super.getAll().stream().
                filter((o) -> o.getSubject().equals(subject))
                .collect(Collectors.toSet()));
    }

    public Set<Teacher> getAll() {
        return new HashSet<>(super.getAll());
    }

}
