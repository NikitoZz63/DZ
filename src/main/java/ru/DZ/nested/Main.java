package ru.DZ.nested;

public class Main {

    private static int weight = 100;
    private int size = 200;
    private static final String hello = "Hello";

    public static class Animal {
        public void myWeight() {
            System.out.println("weight from nested class " + weight);
        }
        static int a = 10;
    }

    public class Fish{
        public void myWeight() {
            System.out.println("weight from inner class " + weight);
        }
        public void mySize() {
            System.out.println("size from inner class " + size);
        }
        public void sum() {
            System.out.println("From inner: " + (Animal.a + Animal.a));
        }
    }

    public static void main(String[] args) {
        Main.Animal animal = new Main.Animal();
        animal.myWeight();

        Main main = new Main();
        Main.Fish fish = main.new Fish();
        fish.mySize();
        fish.myWeight();
        fish.sum();

        class LocalClass {
            public void say(String word){
                System.out.println(word + " - From Local Class");
            }
        }

        LocalClass lc = new LocalClass();
        lc.say(hello);

    }

}