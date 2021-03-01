package com.luxoft.jva001p1.oop.comp.tasks;

public class Phone {

    private String brand;
    private int model;

    private Factory factory;

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public Phone setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getModel() {
        return model;
    }

    public Phone setModel(int model) {
        this.model = model;
        return this;
    }

    public Factory getFactory() {
        return factory;
    }

    public Phone setFactory(Factory factory) {
        this.factory = factory;
        return this;
    }


    public String displayPhone() {
        return "Brand: " + brand
                + " " + model
                + " produced: " + factory.getCity() + ", " + factory.getCountry();
    }
}
