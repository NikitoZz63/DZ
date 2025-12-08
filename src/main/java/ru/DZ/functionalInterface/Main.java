package ru.DZ.functionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product(10, "Apple", 100),
                new Product(5, "Orange", 80),
                new Product(20, "Banana", 60),
                new Product(3, "Milk", 120),
                new Product(7, "Bread", 40),
                new Product(15, "Cheese", 300),
                new Product(12, "Meat", 500),
                new Product(25, "Water", 30),
                new Product(2, "Juice", 150),
                new Product(9, "Tea", 70),
                new Product(30, "Coffee", 400),
                new Product(11, "Sugar", 90),
                new Product(6, "Salt", 20),
                new Product(4, "Rice", 110),
                new Product(13, "Pasta", 95)
        );

//        productMore(products);
//        System.out.println("-----------");
//        productName(products, "Pa");
//        System.out.println("-----------");
//        productMoreCount(products);

        product(products, (p,s) -> {
           return p.getPrice() > 100;
        });
//        product(products, p -> p.getCount() < 3);
//        product(products, p -> p.getName().contains("Pa"));




    }

    public static void productMore(List<Product> products) {
        for (Product product : products) {
            if (product.getPrice() > 100){
                System.out.println(product);
            }
        }
    }

    public static void productMoreCount(List<Product> products) {
        for (Product product : products) {
            if (product.getCount() < 3){
                System.out.println(product);
            }
        }
    }


    public static void productName(List<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                System.out.println(product);
            }
        }
    }


    public static void product(List<Product> products, Verifiable<Product> predicate) {
        for (Product product : products) {
            if (predicate.check(product, 2)) {
                System.out.println(product);
            }
        }
    }

}
