package ru.job4j.inheritance;

public class Programmer extends Engineer{
    private String programLang;

    public Programmer(String programLang, boolean degree, int experience) {
        super(degree, experience);
        this.programLang = programLang;
    }
}