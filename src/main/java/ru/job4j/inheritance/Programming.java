package ru.job4j.inheritance;

public class Programming extends  Engineer{
    private String programLang;

    public Programming(int experience, boolean degree, String programLang) {
        super(experience, degree);
        this.programLang = programLang;
    }

    public void setProgramLang(String programLang) {
        this.programLang = programLang;
    }

    public String getProgramLang() {
        return programLang;
    }
}
