package ru.DZ.streamApi.DZ2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> words = Arrays.asList(
                Arrays.asList("Java", "Kotlin"),
                Arrays.asList("Spring", "Hibernate", "Kafka"),
                Arrays.asList("Docker", "Kubernetes")
        );

        List<String> listWords =  words.stream()
                .flatMap(a -> a.stream())
                .filter(a -> a.length()>5)
                .map(m -> m.toUpperCase())
                .sorted()
                .toList();

        listWords.forEach(System.out::println);

       int a =  listWords.stream()
                .mapToInt(m -> m.length())
                .sum();
        System.out.println(a);

    }
}
