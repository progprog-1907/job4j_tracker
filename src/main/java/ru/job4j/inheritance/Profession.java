package ru.job4j.inheritance;

public class Profession {
    private final boolean degree;

    public Profession(boolean degree) {
        this.degree = degree;
    }

    public boolean isDegree() {
        return degree;
    }

    public static void main(String[] args) {
        Profession profession = new Profession(true);
        Engineer engineer = new Engineer(1, profession.isDegree());
        engineer.setExperience(2);

        Programming programming = new Programming(engineer.getExperience(),
                profession.isDegree(), "Python");
        programming.setProgramLang("Java");
        String language = programming.getProgramLang();
        System.out.println(language);
    }
}
