package ru.job4j.inheritance;

public class Programmer extends Engineer{
    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        super.writeCode();
    }
}
