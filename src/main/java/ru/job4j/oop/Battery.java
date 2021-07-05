package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charging) {
        this.load = charging;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery duracell = new Battery(100);
        Battery panasonic = new Battery(80);
        System.out.println("duracell charging: " + duracell.load + ", panasonic charging: " + panasonic.load);
        duracell.exchange(panasonic);
        System.out.println("duracell charging: " + duracell.load + ", panasonic charging: " + panasonic.load);

    }
}
