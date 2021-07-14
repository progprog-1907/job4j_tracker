package ru.job4j.inheritance;

public class JSONReport extends TextReport{
    public JSONReport() {

    }

    @Override
    public String generate(String name, String body) {
        char dm = (char) 34;
        return "{" + System.lineSeparator() + dm + "name" + dm + " : " + dm + name + dm + "," +
                System.lineSeparator() + dm + "body" + dm + " : " + dm + body + dm +
                System.lineSeparator() + "}";
    }
}
