package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        LocalDateTime item = Item.getCreated();
        System.out.println(item);
    }
}
