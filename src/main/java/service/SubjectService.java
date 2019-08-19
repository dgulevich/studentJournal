package main.java.service;

import main.java.domain.Subject;

import java.util.Set;

public interface SubjectService extends GenericService<Subject> {
    @Override
    Set<Subject> getAll();
}
