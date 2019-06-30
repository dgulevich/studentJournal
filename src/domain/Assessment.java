package domain;

public class Assessment {

    private Integer value;

    private Pupil pupil;

    private Teacher teacher;

    private Subject subject;

    private String task;

    public Assessment() {
    }

    public Assessment(Integer value, Pupil pupil, Teacher teacher, Subject subject, String task) {
        this.value = value;
        this.pupil = pupil;
        this.teacher = teacher;
        this.subject = subject;
        this.task = task;
    }

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

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
