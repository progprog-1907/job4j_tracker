package ru.job4j.oop;

public class Cars {
    private String brand;
    private String model;

    public Cars(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public class Transmission {

        public void accelerate() {
            System.out.println("Ускорение");
        }

    }

    public class Brakes {
        public void brake() {
            System.out.println("Торможение");
        }
    }

    public class TripComputer {
        public String tripData = "Бортовой компьютер";
        private String model = "Модель TripComputer";

        public void getInfo() {
            System.out.println("Модель TripComputer: " + this.model);
            System.out.println("Модель Car: " + Cars.this.model);
        }
    }

    public static TripComputer getTripComputer() {
        Cars cars = new Cars("Марка", "Модель");
        Cars.TripComputer tripComputer = cars.new TripComputer();
        return tripComputer;
    }
}
