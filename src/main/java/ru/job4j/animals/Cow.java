package ru.job4j.animals;

public class Cow implements Animal {
    @Override
    public void  sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }
}
