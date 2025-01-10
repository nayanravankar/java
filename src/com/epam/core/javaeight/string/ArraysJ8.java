package com.epam.core.javaeight.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysJ8 {

    public static void main(String[] args) {

        int[] arr = {21 ,33 ,2,5, 11, 1,14,66, 76,9,3};

        secondHigestElementofArray(arr);

        listAllElementStartWith1(arr);
    }

    private static void secondHigestElementofArray(int[] arr) {
        Integer i = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("second higest element from array - "+i);
    }

    private static void listAllElementStartWith1(int[] arr) {
        List<String> list = Arrays.stream(arr)
                .boxed()
                .map(integer -> integer + "")
                .filter(s -> s.startsWith("1"))
                .toList();

        System.out.println("All Elements that start with 1  - "+list);
    }
}
