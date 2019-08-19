package main.java.dao.impl;

import main.java.dao.SubjectDao;
import main.java.domain.Subject;

import java.util.Optional;
import java.util.Set;
import java.util.HashSet;

import static java.util.Optional.empty;

public class SubjectDaoImpl extends GenericDaoImpl<Subject> implements SubjectDao {

    private static SubjectDao instance;

    private SubjectDaoImpl(){
        super(Subject.class, (o) -> {
            Subject subject = null;
            if (o instanceof Subject) {
                subject = (Subject) o;
            }
            return subject;
        });
    }

    public static SubjectDao getInstance() {
        if (instance == null) {
            instance = new SubjectDaoImpl();
        }
        return instance;
    }

    @Override
    public Set<Subject> getAll() {
        return new HashSet<>(super.getAll());
    }
}
