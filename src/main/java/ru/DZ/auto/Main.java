package ru.DZ.auto;

public class Main {
    public static void main(String[] args) {
        Automobile vw = new Automobile() {
            final String modelName = "Passat";
        };

        System.out.println(vw.model + " " + vw.price);
    }
}