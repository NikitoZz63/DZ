package ru.DZ.streamApi.DZ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("DZ1");

        Arrays.stream(numbers)
                .filter(p -> (p % 2) == 0)
                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        int[] numbers2 = list.stream()
                .mapToInt(p -> p * 2)
                .toArray();
        System.out.println("------------------");
        System.out.println("DZ2");
        for (int i : numbers2) {
            System.out.println(i);
        }
        System.out.println("------------------");
        System.out.println("DZ3");

        IntStream stream = IntStream.of(5, 15, 25, 35);

        List<Integer> listNumber = stream
                .filter(a -> a > 20)
                .boxed()
                .toList();
        listNumber.forEach(System.out::println);

        System.out.println("------------------");
        System.out.println("DZ4");

        List<String> listWords1 = Arrays.asList("apple", "banana", "cherry");

        String[] words1 = listWords1
                .stream()
                .toArray(String[]::new);
        for (String s : words1) {
            System.out.println(s);
        }


        System.out.println("------------------");
        System.out.println("DZ5");

        String[] words = {"kiwi", "mango", "orange"};

        List<String> listWords = Arrays.stream(words)
                .filter(w -> w.length() > 4)
                .toList();

        listWords.forEach(System.out::println);

        System.out.println("------------------");
        System.out.println("DZ6");

        List<Integer> nums = Arrays.asList(1, 3, 6, 8, 9, 12, 15);

        nums.stream()
                .peek(s -> System.out.println("list " + s))
                .filter(p -> p % 3 == 0)
                .forEach(System.out::println);

        System.out.println("------------------");
        System.out.println("DZ7");

        List<Double> prices = Arrays.asList(19.99, 5.50, 12.75, 8.99, 22.00);

        double max = prices.stream()
                .mapToDouble(p -> p)
                .max()
                .orElse(0);
        System.out.println(max);

        System.out.println("------------------");
        System.out.println("DZ8");

        List<Employee> employees = List.of(
                new Employee(25, "IT", "Alex", 120_000),
                new Employee(32, "IT", "Nikita", 150_000),
                new Employee(29, "HR", "Maria", 80_000),
                new Employee(41, "Finance", "Olga", 135_000),
                new Employee(37, "Sales", "Dmitry", 110_000),
                new Employee(22, "Support", "Anna", 60_000),
                new Employee(45, "Logistics", "Pavel", 95_000),
                new Employee(28, "IT", "Sergey", 140_000),
                new Employee(34, "Marketing", "Elena", 105_000),
                new Employee(30, "HR", "Ksenia", 78_000),
                new Employee(50, "Finance", "Irina", 160_000),
                new Employee(27, "Sales", "Ivan", 98_000),
                new Employee(33, "IT", "Roman", 130_000),
                new Employee(26, "Support", "Oleg", 70_000),
                new Employee(38, "Marketing", "Tatiana", 115_000)
        );

        employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .forEach(System.out::println);

    }
}
