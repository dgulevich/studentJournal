package main.java.dao.impl;

import main.java.dao.ClassroomDao;
import main.java.domain.Classroom;
import main.java.domain.Pupil;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Optional.empty;

public class ClassroomDaoImpl extends GenericDaoImpl<Classroom> implements ClassroomDao {

    private static ClassroomDao instance;

    private ClassroomDaoImpl() {
        super(Classroom.class, (o) -> {
            Classroom classroom = null;
            if (o instanceof Classroom) {
                classroom = (Classroom) o;
            }
            return classroom;
        });

    }

    public static ClassroomDao getInstance() {
        if (instance == null) {
            instance = new ClassroomDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Classroom> getByPupil(Pupil pupil) {
       return super.getAll().stream()
                            .filter(p -> p.getPupils().stream()
                                    .anyMatch(o -> o.getId()
                                            .equals(pupil.getId())))
                            .findFirst();
    }

    public Set<Classroom> getAll() {
        return new HashSet<>(super.getAll());
    }
}
