package cafe;

import java.util.ArrayList;

public class Drink {
    private String name;
    private double price;
    private double size;
    private ArrayList<Ingredient> ingredients;


    public Drink() {

        this.ingredients = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public ArrayList<Ingredient> getIngredients() {

        return ingredients;
    }
    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


    @Override
    public String toString() {
        return "Drink{" + "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", ingredients=" + getIngredients().toString() +
                '}';
    }
}
