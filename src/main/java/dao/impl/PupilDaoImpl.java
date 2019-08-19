package main.java.dao.impl;

import main.java.dao.PupilDao;
import main.java.domain.Classroom;
import main.java.domain.Pupil;

import java.util.Optional;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

import static java.util.Optional.empty;

public class PupilDaoImpl extends GenericDaoImpl<Pupil> implements PupilDao {

    private static PupilDao instance;

    private PupilDaoImpl() {
        super(Pupil.class, (o) -> {
            Pupil pupil = null;
            if (o instanceof Pupil) {
                pupil = (Pupil) o;
            }
            return pupil;
        });
    }

    public static PupilDao getInstance() {
        if (instance == null) {
            instance = new PupilDaoImpl();
        }
        return instance;
    }

    @Override
    public Set<Pupil> getByClassroom(Classroom classroom) {
        return new HashSet<>(super.getAll().stream()
                .filter((o) -> o.getClassroom().equals(classroom))
                .collect(Collectors.toSet()));
    }

    public Set<Pupil> getAll() {
        return new HashSet<>(super.getAll());
    }

}
