package ru.job4j.inheritance;

public class Engineer extends Profession {

    private int experience;

    public Engineer(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
