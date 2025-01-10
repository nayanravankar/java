package com.epam.core.javaeight.string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringProgram {
    public static void main(String[] args) {
        
        String s = "nayanravankar";

        findDuplicateElementInString(s);

        findUniqueElementInString(s);

        firstNonRepeatingElement(s);

        String str[] = {"nayan", "advika", "manorama", "ajay", "shalini" };

        largestStringfromArrays(str);
    }

    private static void largestStringfromArrays(String[] str) {
        String s3 = Arrays.stream(str)
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .get();
        System.out.println("Largest string from array - "+s3);
    }

    private static void findDuplicateElementInString(String s) {
        List<String> list = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("duplicate list - "+list);
    }

    private static void findUniqueElementInString(String s) {
        List<String> list = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("unique list - "+list);
    }

    private static void firstNonRepeatingElement(String s) {
        String firstNonRepeating = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() == 1)
                .findFirst()
                .get().getKey();

        System.out.println("first unique list - "+firstNonRepeating);
    }
}
