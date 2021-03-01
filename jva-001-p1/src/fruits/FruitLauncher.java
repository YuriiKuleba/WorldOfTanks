package fruits;

import java.util.ArrayList;

public class FruitLauncher {
    static final String DECOR = "===================";


    public static void main(String[] args) {

        Apple a1 = new Apple();
        Origin ap1 = new Origin();

        ap1.setCountry("Israel");
        ap1.setSelectedYear(1965);

        a1.setSort("Anna");
        a1.setColor("GREEN");
        a1.setWeight(150);
        a1.setOrigin(ap1);
        /*-------------------------
        -------------------------*/
        Mango m1 = new Mango();
        Origin mg1 = new Origin();

        mg1.setCountry("India, UAE");
        mg1.setSelectedYear(1931);

        m1.setSort("Gir Kesar");
        m1.setColor("YELLOW");
        m1.setWeight(350);
        m1.setOrigin(mg1);
        /*--------------------------
        --------------------------*/

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(a1);
        fruits.add(m1);

//      Displaying all kid of fruits

        displayFruit(fruits);

    }


    static void displayFruit(ArrayList<Fruit> fruitList) {

        System.out.println(FruitLauncher.DECOR);
        for (Fruit f : fruitList) {
            System.out.println(f.showFeatures());
            System.out.println(FruitLauncher.DECOR);
        }
    }
}
