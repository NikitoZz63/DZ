package ru.DZ.dzFunctionInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("Nikita", "Oleg");

        toUpper(list, x -> x.toUpperCase(), t -> System.out.println(t));

    }


    public static void toUpper(List<String> list, Function<String, String> function, Consumer<String> consumer) {
        for (String s : list) {
            consumer.accept(function.apply(s));
        }
    }

}
