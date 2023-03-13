package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        StringBuilder str = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            str.append(index);
        }
        System.out.println(str);
    }
}