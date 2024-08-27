package com.epam.core.codility;


import java.util.Arrays;

/*
* Given two integer arrays of the same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to the given index array.

Example:

Input:  arr[]   = [10, 11, 12];
            index[] = [1, 0, 2];
Output: arr[]   = [11, 10, 12]
           index[] = [0,  1,  2]

Input:  arr[]   = [50, 40, 70, 60, 90]
          index[] = [3,  0,  4,  1,  2]
Output: arr[]   = [40, 60, 90, 50, 70]
          index[] = [0,  1,  2,  3,   4]
* */
public class ReorderArray {

    public static void main(String[] args) {

        int arr[] = {10, 11, 12};
        int index[] = {1, 0, 2};

        int len = arr.length;
        int output[] = new int[len];


        for (int i = 0; i< len; i++){

            output[index[i]] = arr[i];
        }

        System.out.println(Arrays.toString(output));
    }
}
