package domain;

public class Pupil extends Person {

    private Classroom classroom;

    public Pupil() {
        super();
    }

    public Pupil(String name, Integer age, Classroom classroom) {
        super(name, age);
        this.classroom = classroom;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
