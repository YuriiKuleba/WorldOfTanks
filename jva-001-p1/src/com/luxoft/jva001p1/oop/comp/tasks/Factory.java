package com.luxoft.jva001p1.oop.comp.tasks;

public class Factory {

    private String country;
    private String city;



    public Factory() {
    }

    public String getCountry() {
        return country;
    }

    public Factory setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Factory setCity(String city) {
        this.city = city;
        return this;
    }
}
