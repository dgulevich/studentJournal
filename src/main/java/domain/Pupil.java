package main.java.domain;

import main.java.annotation.FileStorege;

@FileStorege(name = "Pupil")
public class Pupil extends Person {

    private Classroom classroom;

    public Pupil() {
        super();
    }

    public Pupil(Long id, String name, Integer age, Classroom classroom) {
        super(id, name, age);
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", classroom=" + classroom +
                '}';
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
