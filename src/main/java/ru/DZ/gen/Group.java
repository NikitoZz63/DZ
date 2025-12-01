package ru.DZ.gen;

public class Group<T extends Number, V> {
    private String name;
    private T number;
    private V [] parts;

    public V[] getParts() {
        return parts;
    }

    public void setParts(V[] parts) {
        this.parts = parts;
    }

    public Group(String name, T number, V parts[]) {
        this.name = name;
        this.number = number;
        this.parts = parts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
