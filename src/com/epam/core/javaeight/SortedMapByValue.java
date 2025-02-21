package com.epam.core.javaeight;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedMapByValue {

    public static void main(String[] args) {

        long start, end;

        // Sequential Stream
        start = System.currentTimeMillis();
        IntStream.range(1, 1000000).sum();
        end = System.currentTimeMillis();
        System.out.println("Sequential Stream Time: " + (end - start) + "ms");

        // Parallel Stream
        start = System.currentTimeMillis();
        IntStream.range(1, 1000000).parallel().sum();
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream Time: " + (end - start) + "ms");

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 5);
        map.put("C", 20);
        map.put("D", 30);
        map.put("E", 50);


        LinkedHashMap<String, Integer> collect = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (old, newVal) -> old,
                        LinkedHashMap::new
                ));

        System.out.println("sorted map by value " + collect);
    }
}
