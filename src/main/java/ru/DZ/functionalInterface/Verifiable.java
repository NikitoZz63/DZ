package ru.DZ.functionalInterface;

@FunctionalInterface
public interface Verifiable <T>{
    boolean check(T t, int s);

}
