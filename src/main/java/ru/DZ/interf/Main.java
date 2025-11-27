package ru.DZ.interf;

import ru.DZ.interf.implementation.Bird;
import ru.DZ.interf.implementation.Grasshopper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Grasshopper gs = new Grasshopper();
        gs.fly();
        gs.makeSound();

        Bird bird = new Bird();
        bird.fly();
        bird.makeSound();

    }
}