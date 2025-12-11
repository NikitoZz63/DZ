package ru.DZ.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>(List.of(1, 2, 3, 10));
        int[] a = {0, 10, 3, 7};
        Integer[] b = {0, 2, 6, 7};
        String text = "Nikita";

        Stream<Integer> stream1 = digits.stream();
        Stream<Integer> stream2 = Arrays.stream(b);
        IntStream stream3 = Arrays.stream(a);
        Stream<String> stream4 = text.lines();

        Stream<Integer> stream = Stream.of(4, 5, 8, 10);

//        int[] ab = Arrays.stream(a)
//                .filter(e-> e > 5)
//                .toArray();
//
//        System.out.println(Arrays.toString(ab));
//
//        int[] ab2 = Arrays.stream(a)
//                .filter(e-> e > 5)
//                .toArray();
//
//        List<Integer> newList = digits.stream()
//                .filter(f -> f > 5)
//                .toList();
//
//        for (Integer i : newList) {
//            System.out.println(i);
//        }
//
//        Integer[] newList2 = digits.stream()
//                .filter(f -> f > 5)
//                .toArray(Integer[]::new);
//
//        int[] newList3 = digits.stream()
//                .filter(f -> f > 5)
//                .mapToInt(e -> e)
//                .toArray();
//
//        int[] ac = {1, 20, 5, 7};
//
//        List<Integer> an = Arrays.stream(ac)
//                .boxed()
//                .toList();
//
//        Integer[] ap = Arrays.stream(ac)
//                .boxed()
//                .toArray(Integer[]::new);
//
//        int sum = Arrays.stream(ac)
//                .sum();

        int sum2 = digits.stream()
                .mapToInt(r -> r)
                .peek(System.out::println)
                .max()
                .orElse(0);

    }
}