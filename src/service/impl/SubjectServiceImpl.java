package service.impl;

import dao.SubjectDao;
import dao.impl.SubjectDaoImpl;
import domain.Subject;
import service.SubjectService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SubjectServiceImpl implements SubjectService {

    private static SubjectService instance;

    private SubjectDao subjectDao = SubjectDaoImpl.getInstance();

    private SubjectServiceImpl() {

    }

    public static SubjectService getInstance() {
        if (instance == null) {
            instance = new SubjectServiceImpl();
        }
        return instance;
    }

    @Override
    public Subject save(Subject subject) {
        return null;
    }

    @Override
    public Subject update(Subject subject) {
        return null;
    }

    @Override
    public Set<Subject> getAll() {
        return new HashSet<>();
    }

    @Override
    public Subject getByName(String name) {
        return null;
    }

    @Override
    public void delete(Subject subject) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
