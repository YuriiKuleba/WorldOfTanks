package fruits;

import java.util.ArrayList;

public class Fruit {

    private String color;
    private double weight;

    public Fruit() {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String showFeatures() {
        return "\ncolor: " + getColor() + "\nweight(g): " + getWeight();
    }



}
