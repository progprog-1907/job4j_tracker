package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int countOfPassengers);

    int refuel(int amountOfFuel);
}
