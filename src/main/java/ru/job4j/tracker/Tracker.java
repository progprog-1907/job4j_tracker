package ru.job4j.tracker;

import java.util.Arrays;
import java.lang.System;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] result = new Item[size];
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                result[count++] = items[i];
            }
        }

        result = Arrays.copyOf(result, count);
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return true;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        int start = index + 1;
        items[index].setId(id);
        int length = size - index - 1;
        System.arraycopy(items, start, items, index, length);
        items[size - 1] = null;
        size--;
        return true;
    }
}