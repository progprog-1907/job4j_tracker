package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches > 3) {
                System.out.println("вы ввели не корректное число, надо ввести число от 1 до 3");
                turn = !turn;
            }
            else if (count - matches >= 0) {
                count -= matches;
            } else if (count == 2){
                System.out.println("Вы можете взять спичек либо 1 либо 2");
                turn = !turn;
            } else {
                System.out.println("Вы можете взять только одну спичку");
                turn = !turn;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
