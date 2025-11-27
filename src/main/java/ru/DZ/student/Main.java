package ru.DZ.student;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(null, 123L, "ninads");
        Student student2 = new Student(null, 123L, "ninads");
        Student student3 = new Student("nikita", 123L, "ninads");

        System.out.println(student.equals(student2));

        System.out.println(student);

        System.out.println("student1 hash = " + student.hashCode());
        System.out.println("student2 hash = " + student2.hashCode());

        System.out.println(student.equals(student3));


        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student);
        hashSet.add(student2);

        hashSet.forEach(System.out::println);
    }
}
