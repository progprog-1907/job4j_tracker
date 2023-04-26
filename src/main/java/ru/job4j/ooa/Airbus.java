package ru.job4j.ooa;

public class Airbus {
    private static final int COUNT_ENGINE = 2;
    private final Aircraft aircraft = new Aircraft();

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printModel() {
        aircraft.printModel();
    }

    public void printCountEngine() {
        int countEngine = 4;
        System.out.println(name.equals("A380") ? "Количество двигателей равно: " + countEngine
                : "Количество двигателей равно: " + COUNT_ENGINE);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}