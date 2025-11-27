package ru.DZ.classObject;

import java.lang.reflect.Field;
import java.util.Objects;

public class APP {
    public static void main(String[] args) throws CloneNotSupportedException, IllegalAccessException {

        Auto auto1 = new Auto("Красный", "BMW");
        Auto auto2 = new Auto("Синий", "BMW");
        Auto auto3 = auto2.clone();

        Class <?> a = auto1.getClass();
        Field[] fields = a.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName());
            System.out.println(field.get(auto1));
        }

//        auto2.setColor("Зеленый");
//
//        System.out.println(auto3.getColor());
//
//
//        System.out.println(auto1.hashCode());
//        System.out.println(auto2.hashCode());
//
//        System.out.println(auto1.equals(auto2));
//
//        System.out.println(auto2);
    }
}

class Auto {
    private String model;
    private String color;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(model, auto.model) && Objects.equals(color, auto.color);
    }



    @Override
    protected Auto clone() throws CloneNotSupportedException {
        return new Auto(this.color, this.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Auto(String color, String model) {
        this.color = color;
        this.model = model;


    }
}