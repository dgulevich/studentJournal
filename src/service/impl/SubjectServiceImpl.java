package service.impl;

import dao.SubjectDao;
import dao.impl.SubjectDaoImpl;
import domain.Subject;
import service.SubjectService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

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
    public Optional<Subject> save(Subject subject) {
        return subjectDao.save(subject);
    }

    @Override
    public Optional<Subject> update(Subject subject) {
        return subjectDao.update(subject);
    }

    @Override
    public Set<Subject> getAll() {
        return subjectDao.getAll();
    }

    @Override
    public Optional<Subject> getByName(String name) {
        return subjectDao.getByName(name);
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
