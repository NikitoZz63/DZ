package ru.DZ.dz3.printAll;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class PrintAll {
    public static void main(String[] args) {
        List<String> listAbc = List.of("A", "B", "C");
        Set<Integer> setNum = Set.of(1, 2, 3);

        printCollection(listAbc);
        printCollection(setNum);

    }


    public static <K, T extends Collection<K>> void printCollection(T collection) {

        collection.forEach(System.out::println);
    }

}
