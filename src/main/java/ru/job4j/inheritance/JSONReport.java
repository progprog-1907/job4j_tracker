package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        char dm = (char) 34;
        return "{" + System.lineSeparator() + dm + "name" + dm + " : " + dm + name + dm
                + "," + System.lineSeparator() + dm + "body" + dm + " : " + dm + body + dm
                + System.lineSeparator() + "}";
    }
}
