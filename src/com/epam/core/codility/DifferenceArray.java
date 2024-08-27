package com.epam.core.codility;

/*
* Difference Array | Range update query in O(1)

Consider an array A[] of integers and following two types of queries.

update(l, r, x) : Adds x to all values from A[l] to A[r] (both inclusive).
printArray() : Prints the current modified array.
*
*
Input : A [] { 10, 5, 20, 40 }
        update(0, 1, 10)
        printArray()
        update(1, 3, 20)
        update(2, 2, 30)
        printArray()
Output : 20 15 20 40
         20 35 70 60
Explanation : The query update(0, 1, 10)
adds 10 to A[0] and A[1]. After update,
A[] becomes {20, 15, 20, 40}
Query update(1, 3, 20) adds 20 to A[1],
A[2] and A[3]. After update, A[] becomes
{20, 35, 40, 60}.
Query update(2, 2, 30) adds 30 to A[2].
After update, A[] becomes {20, 35, 70, 60}.
         *
* */

import java.util.Arrays;

public class DifferenceArray {

    public static void main(String[] args) {
        int[] arr= { 10, 5, 20, 40 };
        updateArrayRange(0, 1, 10, arr);
        updateArrayRange(1,3,20, arr);
        updateArrayRange(2,2,30, arr);

    }
    public static void updateArrayRange(int start, int end, int add,  int[] arr){

        for (int i = start; i<= end; i++){
            arr[i] = arr[i] + add;
        }

        System.out.println(Arrays.toString(arr));



    }
}
