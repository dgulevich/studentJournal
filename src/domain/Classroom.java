package domain;

public class Classroom {

    private String name;

    private Integer numberOfPupils;

    private Pupil[] pupils;

    public Classroom() {
    }

    public Classroom(String name, Integer numberOfPupils, Pupil[] pupils) {
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

    public Pupil[] getPupils() {
        return pupils;
    }

    public void setPupils(Pupil[] pupils) {
        this.pupils = pupils;
    }
}
