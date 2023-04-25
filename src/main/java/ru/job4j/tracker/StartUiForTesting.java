package ru.job4j.tracker;

public class StartUiForTesting {
    public static void main(String[] args) {
        Log4File log = Log4File.getInstance();
        log.add("Add new Item");
        log.save();
    }
}
