package dao;

import domain.Subject;

import java.util.Set;

public interface SubjectDao extends GenericDao<Subject> {
    @Override
    Set<Subject> getAll();
}
