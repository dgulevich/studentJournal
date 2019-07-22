package domain;

public class Teacher extends Person {

    private Integer salary;

    private String function;

    private Subject subject;

    public Teacher() {
        super();
    }

    public Teacher(String name, Integer age, Integer salary, String function, Subject subject) {
        super(name, age);
        this.salary = salary;
        this.function = function;
        this.subject = subject;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
