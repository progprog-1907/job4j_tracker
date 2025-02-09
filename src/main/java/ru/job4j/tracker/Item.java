package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private int id;
    private String name;
    private static final LocalDateTime CREATED = LocalDateTime.now();
    static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static LocalDateTime getCreated() {
        return CREATED;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id="
                + id + ", name='" + name + '\''
                + ", created=" + CREATED.format(FORMATTER)
                + '}';
    }
}