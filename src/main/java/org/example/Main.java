package org.example;

import org.example.MapRealization.MyDictionary;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        MyDictionary<String, Integer> dictionary = new MyDictionary<>();
        Map<String, Integer> map = new HashMap<>();
        Instant startDictionary = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            dictionary.put(String.valueOf(i), i);
        }
        Instant finishDictionary=Instant.now();
        long elapsed = Duration.between(startDictionary, finishDictionary).toMillis();
        System.out.println("Прошло времени для словаря, мс: " + elapsed);
    }
}