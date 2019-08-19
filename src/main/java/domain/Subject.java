package main.java.domain;

import main.java.annotation.FileStorege;

@FileStorege(name = "Subject")
public class Subject extends BaseEntity{

    private String name;

    public Subject() {
    }

    public Subject(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
