package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Машина едет");
    }

    @Override
    public void passengers(int countOfPassengers) {
        System.out.println("Всего пассажиров: " + countOfPassengers);
    }

    @Override
    public int refuel(int amountOfFuel) {
        return 50 * amountOfFuel;
    }
}
