package ru.DZ.dz3.swap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        System.out.println( swap(list, 0, 1));
    }


    public static  <T> List<T> swap(List<T> list, int indexA, int indexB) {

        T a = list.get(indexA);
        T b = list.get(indexB);

        list.set(indexA, b);
        list.set(indexB, a);

        return list;
    }
}
