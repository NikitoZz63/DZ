package ru.DZ.streamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Office {
    public static void main(String[] args) {

        Emmploye employee1 = new Emmploye();
        employee1.setName("Алексей Смирнов");
        employee1.setZp(70000);

        Emmploye employee2 = new Emmploye();
        employee2.setName("Иван Петров");
        employee2.setZp(72000);

        Emmploye employee3 = new Emmploye();
        employee3.setName("Мария Соколова");
        employee3.setZp(68000);

        Emmploye employee4 = new Emmploye();
        employee4.setName("Дмитрий Орлов");
        employee4.setZp(75000);

        Emmploye employee5 = new Emmploye();
        employee5.setName("Елена Васильева");
        employee5.setZp(69000);

        Emmploye employee6 = new Emmploye();
        employee6.setName("Сергей Кузнецов");
        employee6.setZp(71000);

        Emmploye employee7 = new Emmploye();
        employee7.setName("Анна Морозова");
        employee7.setZp(66000);

        Emmploye employee8 = new Emmploye();
        employee8.setName("Павел Волков");
        employee8.setZp(73000);

        Emmploye employee9 = new Emmploye();
        employee9.setName("Ольга Белова");
        employee9.setZp(64000);

        Emmploye employee10 = new Emmploye();
        employee10.setName("Максим Фёдоров");
        employee10.setZp(76000);

        Emmploye employee11 = new Emmploye();
        employee11.setName("Ирина Крылова");
        employee11.setZp(70000);

        Emmploye employee12 = new Emmploye();
        employee12.setName("Виктор Ефимов");
        employee12.setZp(72000);

        Emmploye employee13 = new Emmploye();
        employee13.setName("Алиса Чернова");
        employee13.setZp(68000);

        Emmploye employee14 = new Emmploye();
        employee14.setName("Георгий Лебедев");
        employee14.setZp(75000);

        Emmploye employee15 = new Emmploye();
        employee15.setName("Ксения Карпова");
        employee15.setZp(69000);

        Emmploye employee16 = new Emmploye();
        employee16.setName("Никита Журавлев");
        employee16.setZp(71000);

        Emmploye employee17 = new Emmploye();
        employee17.setName("Тимофей Громов");
        employee17.setZp(66000);

        Emmploye employee18 = new Emmploye();
        employee18.setName("Вероника Павлова");
        employee18.setZp(73000);

        Emmploye employee19 = new Emmploye();
        employee19.setName("Михаил Костин");
        employee19.setZp(64000);

        Emmploye employee20 = new Emmploye();
        employee20.setName("Полина Савина");
        employee20.setZp(76000);

        Emmploye employee21 = new Emmploye();
        employee21.setName("Ярослав Данилов");
        employee21.setZp(70000);

        Emmploye employee22 = new Emmploye();
        employee22.setName("Егор Романов");
        employee22.setZp(72000);

        Emmploye employee23 = new Emmploye();
        employee23.setName("Татьяна Котова");
        employee23.setZp(68000);

        Emmploye employee24 = new Emmploye();
        employee24.setName("Руслан Бойцов");
        employee24.setZp(75000);

        Emmploye employee25 = new Emmploye();
        employee25.setName("Лилия Прохорова");
        employee25.setZp(69000);

        Emmploye employee26 = new Emmploye();
        employee26.setName("Владимир Фомин");
        employee26.setZp(71000);

        Emmploye employee27 = new Emmploye();
        employee27.setName("Кристина Осипова");
        employee27.setZp(66000);

        Emmploye employee28 = new Emmploye();
        employee28.setName("Артур Лавров");
        employee28.setZp(73000);

        Emmploye employee29 = new Emmploye();
        employee29.setName("Дарья Цветкова");
        employee29.setZp(64000);

        Emmploye employee30 = new Emmploye();
        employee30.setName("Фёдор Голубев");
        employee30.setZp(76000);

        Company firstCompany = new Company();
        firstCompany.setNameCompany("TechNova Solutions");
        firstCompany.setAge(12);

        Company secondCompany = new Company();
        secondCompany.setNameCompany("SkyBridge Systems");
        secondCompany.setAge(8);

        Company thirdCompany = new Company();
        thirdCompany.setNameCompany("QuantumPeak Labs");
        thirdCompany.setAge(5);

        firstCompany.addEmmploye(employee1);
        firstCompany.addEmmploye(employee2);
        firstCompany.addEmmploye(employee3);
        firstCompany.addEmmploye(employee4);
        firstCompany.addEmmploye(employee5);
        firstCompany.addEmmploye(employee6);
        firstCompany.addEmmploye(employee7);
        firstCompany.addEmmploye(employee8);
        firstCompany.addEmmploye(employee9);
        firstCompany.addEmmploye(employee10);

        secondCompany.addEmmploye(employee11);
        secondCompany.addEmmploye(employee12);
        secondCompany.addEmmploye(employee13);
        secondCompany.addEmmploye(employee14);
        secondCompany.addEmmploye(employee15);
        secondCompany.addEmmploye(employee16);
        secondCompany.addEmmploye(employee17);
        secondCompany.addEmmploye(employee18);
        secondCompany.addEmmploye(employee19);
        secondCompany.addEmmploye(employee20);

        thirdCompany.addEmmploye(employee21);
        thirdCompany.addEmmploye(employee22);
        thirdCompany.addEmmploye(employee23);
        thirdCompany.addEmmploye(employee24);
        thirdCompany.addEmmploye(employee25);
        thirdCompany.addEmmploye(employee26);
        thirdCompany.addEmmploye(employee27);
        thirdCompany.addEmmploye(employee28);
        thirdCompany.addEmmploye(employee29);
        thirdCompany.addEmmploye(employee30);


        List<Company> companies = new ArrayList<>();
        companies.add(firstCompany);
        companies.add(secondCompany);
        companies.add(thirdCompany);

        List<String> list1 = companies.stream()
                .map(Company::getNameCompany)
                .toList();

        List<String> list2 = companies.stream()
                .flatMap(e -> e.getEmmployes().stream())
                .map(Emmploye::getName)
                .toList();

        list1.forEach(System.out::println);
        list2.forEach(System.out::println);


        int sum = companies.stream()
                .flatMap(e -> e.getEmmployes().stream())
                .mapToInt(Emmploye::getZp)
                .sum();

        System.out.println(sum);

        List<Emmploye> emmployes1 = companies.stream()
                .flatMap(e -> e.getEmmployes().stream())
                .toList();

        Map<String, Emmploye> emmployeHashMap = emmployes1.stream()
                .collect(Collectors.toMap(Emmploye::getName, Function.identity()));

//        System.out.println();
//        for (Map.Entry<String, Emmploye> stringEmmployeEntry : emmployeHashMap.entrySet()) {
//            System.out.println(stringEmmployeEntry.getKey());
//            System.out.println(stringEmmployeEntry);
//            System.out.println();
//        }

        LinkedList<Emmploye> emmployeLinkedList = emmployes1.stream()
                .sorted(Comparator.comparing(Emmploye::getZp).reversed())
                .collect(Collectors.toCollection(LinkedList::new));

        for (Emmploye emmploye : emmployeLinkedList) {
            System.out.println(emmploye);
        }

    }
}
