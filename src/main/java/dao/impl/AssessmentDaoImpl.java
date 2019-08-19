package main.java.dao.impl;

import main.java.dao.AssessmentDao;
import main.java.domain.Assessment;
import main.java.domain.Pupil;
import main.java.domain.Subject;
import main.java.domain.Teacher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Optional.empty;

public class AssessmentDaoImpl extends GenericDaoImpl<Assessment> implements AssessmentDao {

    private static AssessmentDao instance;

    private AssessmentDaoImpl() {
        super(Assessment.class, (o) -> {
            Assessment assessment = null;
            if (o instanceof Assessment) {
                assessment = (Assessment) o;
            }
            return assessment;
        });
    }


    public static AssessmentDao getInstance() {
        if (instance == null) {
            instance = new AssessmentDaoImpl();
        }
        return instance;
    }


    @Override
    public List<Assessment> getByValue(Integer value) {
        return new ArrayList<>(super.getAll().stream()
                .filter(o -> o.getValue().equals(value))
                .collect(Collectors.toList()));
     }

    @Override
    public List<Assessment> getByPupil(Pupil pupil) {
        return new ArrayList<>(super.getAll().stream()
                .filter(o -> o.getPupil().equals(pupil))
                .collect(Collectors.toList()));
    }

    @Override
    public List<Assessment> getByTeacher(Teacher teacher) {
        return new ArrayList<>(super.getAll().stream()
                .filter(o -> o.getTeacher().equals(teacher))
                .collect(Collectors.toList()));
    }

    @Override
    public List<Assessment> getBySubject(Subject subject) {
        return new ArrayList<>(super.getAll().stream()
                .filter(o -> o.getSubject().equals(subject))
                .collect(Collectors.toList()));
    }
}
