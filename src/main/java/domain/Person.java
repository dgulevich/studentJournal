package main.java.domain;

abstract public class Person extends BaseEntity {

    private String name;

    private Integer age;

    public Person() {
    }

    public Person(Long id, String name, Integer age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
