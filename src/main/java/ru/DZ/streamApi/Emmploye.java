package ru.DZ.streamApi;

public class Emmploye {

    private String name;
    private int zp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZp() {
        return zp;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    @Override
    public String toString() {
        return "Emmploye{" +
                "name='" + name + '\'' +
                ", zp=" + zp +
                '}';
    }
}
