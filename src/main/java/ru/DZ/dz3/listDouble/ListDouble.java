package ru.DZ.dz3.listDouble;

import java.util.List;

public class ListDouble {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        sum(list);
    }

    public static void sum(List<? extends Number> list) {
        System.out.println(
        list.stream()
                .mapToDouble(x ->  x.doubleValue())
                .sum()
        );
    }
}
