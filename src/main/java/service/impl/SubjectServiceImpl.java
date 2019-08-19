package main.java.service.impl;

import main.java.dao.SubjectDao;
import main.java.dao.impl.SubjectDaoImpl;
import main.java.domain.Subject;
import main.java.service.SubjectService;

import java.util.Optional;
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
    public Optional<Subject> getById(Long id) {
        return subjectDao.getById(id);
    }

    @Override
    public void delete(Subject subject) {
        subjectDao.delete(subject);
    }

    @Override
    public void deleteAll() {
        subjectDao.deleteAll();
    }

    public void deleteById(Long id) {
        subjectDao.deleteById(id);
    }
}
