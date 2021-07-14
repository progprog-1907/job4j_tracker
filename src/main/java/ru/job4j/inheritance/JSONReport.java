package ru.job4j.inheritance;

public class JSONReport extends TextReport{
    final char dm = (char) 34;
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + dm + "name" + dm + " : " + dm + name + dm + "," +
                System.lineSeparator() + dm + "body" + dm + " : " + dm + body + dm +
                System.lineSeparator() + "}";
    }
}
