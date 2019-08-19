package main.java.domain;

import main.java.annotation.FileStorege;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@FileStorege(name = "Classroom")
public class Classroom extends BaseEntity {

    private String name;

    private Integer numberOfPupils;

    private Set<Pupil> pupils;

    public Classroom() {
    }

    public Classroom(Long id, String name) {
        super(id);
        this.name = name;
        this.pupils = pupils;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return getId().equals(classroom.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Pupil> getPupils() {
        return new HashSet<>();
    }

    public void setPupils(Set<Pupil> pupils) { this.pupils = pupils; }
}
