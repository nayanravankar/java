package com.epam.core.javaeight.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentChat {

    public static void main(String[] args) {

        String str = "aabbbccddeeffgffg";

        Character a   = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(a);
    }
}
