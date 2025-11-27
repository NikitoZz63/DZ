package ru.DZ.interf.implementation;

import ru.DZ.interf.interfaces.Flying;
import ru.DZ.interf.interfaces.MakeASound;

public class Bird implements Flying, MakeASound {
    @Override
    public void fly() {
        System.out.println("Bird flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird say Чирик");
    }
}
