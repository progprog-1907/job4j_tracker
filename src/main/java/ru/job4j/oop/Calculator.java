package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = sum(10);
        System.out.println(sum);
        int num = 10;
        int minus = calculator.minus(num);
        System.out.println(minus);
        int multiply = calculator.multiply(num);
        System.out.println(multiply);
        int divide = calculator.divide(num);
        System.out.println(divide);
        int sumAllOperation = calculator.sumAllOperation(num);
        System.out.println(sumAllOperation);
    }
}