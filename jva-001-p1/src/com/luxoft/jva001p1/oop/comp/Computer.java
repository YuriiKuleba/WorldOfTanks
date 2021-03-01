package com.luxoft.jva001p1.oop.comp;

public class Computer {

    String laptop;

    double price$ = 1000;

    int memory;

    boolean isUpgraded;


    void showPrice() {

        System.out.println(this.price$);
    }

    void displayLaptop(String prefix) {

        System.out.println(prefix);
        System.out.println("Laptop: " + laptop + "\n" +
                "has memory: " + memory + "mb\n" +
                "costs: " + price$ + "$\n" +
                "is upgraded: " + isUpgraded);
    }

    public double priceWithUpgrade() {

        return price$ + 150;
    }


    public void setPrice$(double newPrice$) {
        if (newPrice$ < this.price$) {
            this.price$ = newPrice$;
        }
    }

    public Computer setLaptop(String laptop) {
        this.laptop = laptop;
        return this;
    }

    public String getLaptop() {
        return laptop;
    }
}
