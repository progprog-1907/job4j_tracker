package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Online: " + active);
        System.out.println("Status number: " + status);
        System.out.println("Message " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.active = false;
        error.status = 2;
        error.message = "Bye";
        error.printInfo();

        Error truth = new Error(true, 1, "Hello");
        truth.printInfo();
    }
}
