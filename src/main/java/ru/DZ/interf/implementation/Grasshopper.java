package ru.DZ.interf.implementation;

import ru.DZ.interf.interfaces.Flying;
import ru.DZ.interf.interfaces.Jumping;
import ru.DZ.interf.interfaces.MakeASound;

public class Grasshopper implements Flying, Jumping, MakeASound {
    @Override
    public void fly() {
        System.out.println("Grasshopper fly");
    }

    @Override
    public void jump() {
        System.out.println("Grasshopper jump");
    }

    @Override
    public void makeSound() {
        System.out.println("Grasshopper makeSound");
    }
}
