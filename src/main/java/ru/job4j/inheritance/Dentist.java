package ru.job4j.inheritance;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        super.dentures();
    }
}
