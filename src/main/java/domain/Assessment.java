package main.java.domain;

import main.java.annotation.FileStorege;

@FileStorege(name = "Assessment")
public class Assessment extends BaseEntity {

    private String name;

    private Integer value;

    private Pupil pupil;

    private Teacher teacher;

    private Subject subject;

    public Assessment() {
    }

    public Assessment(Long id, String name, Integer value, Pupil pupil, Teacher teacher, Subject subject) {
        super(id);
        this.name = name;
        this.value = value;
        this.pupil = pupil;
        this.teacher = teacher;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", pupil=" + pupil +
                ", teacher=" + teacher +
                ", subject=" + subject +
                '}';
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Pupil getPupil() {
        return pupil;
    }

    public void setPupil(Pupil pupil) {
        this.pupil = pupil;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
