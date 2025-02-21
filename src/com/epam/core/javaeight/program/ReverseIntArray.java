package com.epam.core.javaeight.program;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*WAP to reverse array of integers */
public class ReverseIntArray {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1, 0};

        IntStream.range(0, arr.length/2)
                .forEach(i -> {
                    int temp = arr[i];
                    arr[i] = arr[arr.length-i-1];
                    arr[arr.length-i-1] = temp;
                });

        System.out.println(Arrays.toString(arr));

    }
}
