package ru.DZ.interf.implementation;

import ru.DZ.interf.interfaces.Crawling;
import ru.DZ.interf.interfaces.MakeASound;

public class Snake implements Crawling, MakeASound {


    @Override
    public void crawl() {
        System.out.println("Snake is crawl");
    }

    @Override
    public void makeSound() {
        System.out.println("Snake make sound");
    }
}
