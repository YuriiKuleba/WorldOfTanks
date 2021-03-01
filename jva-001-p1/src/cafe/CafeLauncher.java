package cafe;

import java.util.ArrayList;

public class CafeLauncher {

    public static void main(String[] args) {


        Ingredient water = new Ingredient();
        water.setName("water");
        Ingredient coffee_c = new Ingredient();
        coffee_c.setName("coffee");
        Ingredient sugar = new Ingredient();
        sugar.setName("sugar");
        Ingredient milk = new Ingredient();
        milk.setName("milk");
        Ingredient tea_t = new Ingredient();
        tea_t.setName("tea");
        Ingredient lemon = new Ingredient();
        lemon.setName("lemon");
        Ingredient honey = new Ingredient();
        honey.setName("honey");
        Ingredient carmel = new Ingredient();
        carmel.setName("carmel");


        ArrayList<Ingredient> cafeIngredients = new ArrayList<>();
        cafeIngredients.add(water);
        cafeIngredients.add(coffee_c);
        cafeIngredients.add(sugar);
        cafeIngredients.add(milk);
        cafeIngredients.add(tea_t);
        cafeIngredients.add(lemon);
        cafeIngredients.add(honey);
        cafeIngredients.add(carmel);

//--------------------------------------------------------------------

        Drink coffee = new Drink();

        ArrayList<Ingredient> coffeeList = new ArrayList<>();
        coffeeList.add(water);
        coffeeList.add(coffee_c);
        coffeeList.add(sugar);

        coffee.setName("Coffee");
        coffee.setPrice(3.00);
        coffee.setSize(150.00);
        coffee.setIngredients(coffeeList);

//--------------------------------------------------------------------

        Drink latte = new Drink();

        ArrayList<Ingredient> latteList = new ArrayList<>();
        latteList.add(coffee_c);
        latteList.add(sugar);
        latteList.add(milk);

        latte.setName("Latte");
        latte.setPrice(5.00);
        latte.setSize(200.00);
        latte.setIngredients(latteList);

//---------------------------------------------------------------------

        Drink tea = new Drink();

        ArrayList<Ingredient> teaList = new ArrayList<>();
        teaList.add(water);
        teaList.add(sugar);
        teaList.add(tea_t);
        teaList.add(lemon);

        tea.setName("Tea");
        tea.setPrice(2.50);
        tea.setSize(300.00);
        tea.setIngredients(teaList);

//---------------------------------------------------------------------

        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(coffee);
        drinks.add(latte);
        drinks.add(tea);

//----------------------------------------------------------------------

        Menu menu = new Menu();

        CustomDrink customCoffee = new CustomDrink();


        drinks.add(customCoffee.upgradeDrink("CoffeeWithHoney", 5.50,300, water, coffee_c, honey, carmel));


        menu.setDrinks(drinks);

        menu.printDrinks();

        System.out.println(menu.getDrinks().get(3));


    }
}
