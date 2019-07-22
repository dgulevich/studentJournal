package domain;

import java.util.HashSet;
import java.util.Set;

public class Classroom {

    private String name;

    private Integer numberOfPupils;

    private Set<Pupil> pupils;

    public Classroom() {
    }

    public Classroom(String name, Integer numberOfPupils, Set<Pupil> pupils) {
        this.name = name;
        this.numberOfPupils = numberOfPupils;
        this.pupils = pupils;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfPupils() {
        return numberOfPupils;
    }

    public void setNumberOfPupils(Integer numberOfPupils) {
        this.numberOfPupils = numberOfPupils;
    }

    public Set<Pupil> getPupils() {
        return new HashSet<>();
    }

    public void setPupils(Set<Pupil> pupils) { this.pupils = pupils; }
}
