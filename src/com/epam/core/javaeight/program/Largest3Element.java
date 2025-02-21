package com.epam.core.javaeight.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
* Given an array arr[], the task is to find the top three largest distinct integers present in the array.

Note: If there are less than three distinct elements in the array, then return the available distinct numbers in descending order.
* */
public class Largest3Element {

    public static void main(String[] args) {

     Integer arr[] = {10, 4, 3, 50, 23, 90};

        largestThreeElements(arr);
        secondLargestElement(arr);


    }

    private static void largestThreeElements(Integer[] arr) {
        List<Integer> lst = Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println(lst);
    }


    private static void secondLargestElement(Integer[] arr) {
        Optional<Integer> first = Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst();

        System.out.println(first.get());
    }
}

