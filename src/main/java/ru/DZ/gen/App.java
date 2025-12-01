package ru.DZ.gen;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        String[] m1 = {"Nik", "Maks", "Anton"};
        Person person1 = new Person(20, "Anton");
        Person person2 = new Person(30, "Nik");

        Person[] persons = {person1, person2};

        Group<Integer, String> group = new Group<>("name", 123, m1);
        Group<Long, Person> group2 = new Group<>("group2", 323L, persons);


        Number [] numbers = { 3,4,2.4};
        Integer [] integers = {10,2,3,23};

        getArray("EWf", 2);
        numbers = integers;

        List <Number> num = new ArrayList<>();
        List<Integer> int1 = new ArrayList<>();


        group2.getParts()[0].getName();
        group.getParts()[0].isEmpty();

        Integer [] integers1 = {1, 2, 3, 4, 5};
        Double [] doubles1 = {2.5, 3.5, 5.5, 1.2};

        getNumber(integers1);
        getNumber(doubles1);


        List<? super Number> numbers1 = new ArrayList<>();
       numbers1.add(9);
       numbers1.get(2);




    }


    public static <A extends Number> void getNumber(A [] mass){
        double sum = 0;
        for (A a : mass) {
            sum += a.doubleValue();
        }
        System.out.println(sum);
    }




    public static <R> void getArray(R r,int count){
        for (int i = 0; i < count ; i++) {
            System.out.println(r);
        }
    }



}
