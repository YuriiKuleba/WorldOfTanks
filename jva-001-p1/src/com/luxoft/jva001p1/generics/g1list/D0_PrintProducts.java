package com.luxoft.jva001p1.generics.g1list;

import com.luxoft.jva001p1.generics.Axe;
import com.luxoft.jva001p1.generics.Monitor;
import com.luxoft.jva001p1.generics.Product;

import java.util.ArrayList;
import java.util.List;

public class D0_PrintProducts {
    public static void main(String[] args)
    {
        long counter = 1;

        List<Product> products = new ArrayList<>();

        products.add(new Monitor(counter++ , 20));
        products.add(new Monitor(counter++ , 20));
        products.add(new Monitor(counter++ , 27));

        products.add(new Axe(counter++ , 1.5));
        products.add(new Axe(counter++ , 2));

        printPrices(products);

//        Product p1 = new Product(700);
//        System.out.println(p1.getUid() + " " + p1.getPrice());
//        Product p2 = new Monitor(600 , 27);
//        System.out.println(p2.getUid() + " " + p2.getPrice() + " " + ((Monitor) p2).getDiagonal());
//        Product p3 = new Axe(500 , 15);
//        System.out.println(p3.getUid() + " " + p3.getPrice() +" " + ((Axe)p3).getWeight());

//
//        System.out.println(products.get(0).toString());
//        System.out.println(products.get(4).toString());


    }

    private static void printPrices(List<Product> products)
    {
        for (Product product : products) {
            System.out.print("Product: [uid: " + product.getUid() + ", price: " + product.getPrice());

            if (product instanceof Monitor) {
                System.out.print(", diagonal: " + ((Monitor) product).getDiagonal());
            } else if (product instanceof Axe) {
                System.out.print(", weight: " + ((Axe) product).getWeight());
            }
            System.out.println("]");
        }
    }
}
