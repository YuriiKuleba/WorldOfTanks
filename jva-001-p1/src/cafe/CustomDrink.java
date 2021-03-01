package cafe;


import java.util.ArrayList;
import java.util.Arrays;

public class CustomDrink extends Drink {

    public CustomDrink() {

    }
    public Drink upgradeDrink(String name , double price , double size , Ingredient ...ingredients) {

        Drink modern = new Drink();
        modern.setName(name);
        modern.setPrice(price);
        modern.setSize(size);
        modern.setIngredients(new ArrayList<>(Arrays.asList(ingredients)));

        return modern;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}