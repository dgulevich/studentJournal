package domain;

public class Assessment {

    private String name;

    private Integer value;

    private Pupil pupil;

    private Teacher teacher;

    private Subject subject;

    private String task;

    public Assessment() {
    }

    public Assessment(String name, Integer value, Pupil pupil, Teacher teacher, Subject subject, String task) {
        this.name = name;
        this.value = value;
        this.pupil = pupil;
        this.teacher = teacher;
        this.subject = subject;
        this.task = task;
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

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
