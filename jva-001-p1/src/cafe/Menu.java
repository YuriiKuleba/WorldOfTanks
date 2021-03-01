package cafe;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Drink> drinks;

    public Menu() {

        this.drinks = new ArrayList<>();

    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }


    public void printDrinks() {

        for (Drink drink : drinks) {
            System.out.println(drink.getName() + " ");
        }
    }
}
