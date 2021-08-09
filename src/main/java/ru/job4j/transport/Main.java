package ru.job4j.transport;

public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicle = new Vehicle[] {airplane, train, bus};
        for (Vehicle v : vehicle) {
            v.move();
        }
    }
}
