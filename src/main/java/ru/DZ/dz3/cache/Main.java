package ru.DZ.dz3.cache;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Cache<String, String> cache = new InMemoryCache<>();

        cache.put("kk", "vv");
        System.out.println(cache.get("kk"));
        System.out.println(cache.containsKey("kk"));

    }
}
