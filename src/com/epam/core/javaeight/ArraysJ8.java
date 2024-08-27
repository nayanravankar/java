package com.epam.core.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysJ8 {

    public static void main(String[] args) {

        int[] arr1= {1,23,4,5,8,0};
        int[] arr2= {1,2,8,5,9,1};
        commonElementIn2Array(arr1, arr2);

        reverseArrayinPlace(arr1);
    }

    static void commonElementIn2Array(int[] arr1, int[] arr2){

        List<Integer> lst = Arrays.stream(arr1)
                                .filter(value -> Arrays.stream(arr2).anyMatch(value1 -> value1==value))
                                .boxed()// boxed to convert primitive to wrapper Integer
                                .collect(Collectors.toList());

        System.out.println("Common Elements in Array - "+ lst);

    }

    static void reverseArrayinPlace(int[] arr){

        IntStream.range(0,arr.length/2)
                .forEach(
                        i -> {
                            int temp =  arr[arr.length-i-1 ] ;
                            arr[arr.length-i-1 ] = arr[i];
                            arr[i] = temp;

                        }
                );
        System.out.println(Arrays.toString(arr));
    }
}
