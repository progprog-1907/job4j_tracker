package ru.job4j.oop;

public class CarsMain {
    public static void main(String[] args) {
        Cars cars = new Cars("Марка", "Модель");
        Cars.Transmission transmission = cars.new Transmission();
        Cars.Brakes brakes = cars.new Brakes();
        cars.startEngine();
        transmission.accelerate();
        brakes.brake();
        Cars.TripComputer tripComputer = cars.new TripComputer();
        tripComputer.getInfo();
    }
}
