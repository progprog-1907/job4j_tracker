package ru.job4j.inheritance;

public class Builder extends Engineer{
    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        super.buildHouse();
    }
}
