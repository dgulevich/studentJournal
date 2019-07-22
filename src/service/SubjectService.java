package service;

import domain.Subject;

import java.util.Collection;
import java.util.Set;

public interface SubjectService extends GenericService<Subject> {
    @Override
    Set<Subject> getAll();
}
