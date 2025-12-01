package ru.DZ.dz3.cache;

import java.util.HashMap;

public class InMemoryCache <K, V> implements Cache<K, V>{

    HashMap<K, V> hashMap = new HashMap<>();


    @Override
    public void put(K key, V value) {
        hashMap.put(key, value);
    }

    @Override
    public V get(K key) {
       return hashMap.get(key);
    }

    @Override
    public boolean containsKey(K key) {
       return hashMap.containsKey(key);
    }
}
