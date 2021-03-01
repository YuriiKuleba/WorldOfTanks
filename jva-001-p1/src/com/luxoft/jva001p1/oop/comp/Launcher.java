package com.luxoft.jva001p1.oop.comp;

import java.util.ArrayList;
import java.util.Arrays;

public class Launcher {

    public static void main(String[] args) {

        Computer comp1 = new Computer();
        Computer comp2 = new Computer();
        Computer comp3 = new Computer();


        comp1.laptop = "HP";
        comp1.price$ = 1500.00;
        comp1.memory = 16384;
        comp1.isUpgraded = false;


        comp2.laptop = "Asus";
        comp2.price$ = 1100.00;
        comp2.memory = 12288;
        comp2.isUpgraded = true;

        comp3.laptop = "Acer";
        comp3.price$ = 1200.00;
        comp3.memory = 8192;
        comp3.isUpgraded = false;


        Computer[] computers = new Computer[3];

        computers[0] = comp1;
        computers[1] = comp2;
        computers[2] = comp3;

        comp1.showPrice();

        for (Computer computer : computers) {

            System.out.println("Laptop: " + computer.laptop + "; price: " + computer.price$ + "$");
        }


        ArrayList<Computer> compList = new ArrayList<>();

        compList.add(comp1);
        compList.add(comp2);
        compList.add(comp3);

        comp1.displayLaptop("*******************");
        compList.get(2).displayLaptop("###################");

        System.out.println("\nPrice with upgrade: " + comp1.priceWithUpgrade() + "$");

        compList.get(2).setPrice$(900);
        System.out.println(compList.get(2).price$);


    }


}
