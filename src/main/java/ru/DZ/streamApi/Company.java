package ru.DZ.streamApi;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String nameCompany;
    private int age;

    private List<Emmploye> emmployes = new ArrayList<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Emmploye> getEmmployes() {
        return emmployes;
    }

    public void setEmmployes(List<Emmploye> emmployes) {
        this.emmployes = emmployes;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void addEmmploye(Emmploye emmploye) {
        emmployes.add(emmploye);
    }
}
