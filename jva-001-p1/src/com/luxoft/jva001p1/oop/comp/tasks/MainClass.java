package com.luxoft.jva001p1.oop.comp.tasks;

public class MainClass {

    public static void main(String[] args) {


        Phone p1 = new Phone();

        Factory factory = new Factory();


        factory.setCountry("China");
        factory.setCity("Hong Kong");

        p1.setBrand("HTC");
        p1.setModel(10);
        p1.setFactory(factory);


        System.out.println(p1.displayPhone());

    }
}
