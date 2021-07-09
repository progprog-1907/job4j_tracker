package ru.job4j.oop;

public class User {
    private String name; // Поле объекта, потому что она внутри именно класса
    private int age; // Поле объекта

    public boolean canDrive() {
        boolean can = false; // Локальная переменная, потому что она в нутри метода каласса
        if (age >= 18) {
            can = true; // Меняем локальную переменную
        }
        return can; // Возвращаем локальную переменную
    }
}