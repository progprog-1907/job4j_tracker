package ru.job4j.oop;

public class StNested {

    private static int num1;
    public int num2;

    public StNested() {

    }

    static class StaticNested {

        void setStaticOuterVariable(int value) {
            StNested.num1 = value;
        }

    }

    public static void main(String[] args) {
        StNested.num1 = 1;
        StaticNested nested = new StaticNested();
        nested.setStaticOuterVariable(2);
        System.out.println("num1 = " + StNested.num1);
    }
}
