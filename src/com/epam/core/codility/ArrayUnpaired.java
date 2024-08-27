package com.epam.core.codility;


import java.util.HashSet;
import java.util.Set;

// Find unpaired array elements in array, like array {{1,2,1,3,4,5,2,5}} having unpaired element like 3 and 4
public class ArrayUnpaired {

    public static void main(String[] args) {

        int arr[] = {1,2,1,3,4,5,2,5,3};
        int len = arr.length;

        Set<Integer> set = new HashSet<>();
        for (int i=0 ; i<len; i++){

            if (set.contains(arr[i])){
                set.remove(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        System.out.println(set.iterator().next());

        System.out.println("all unpaired elemnts = " + set.toString());


    }
}
