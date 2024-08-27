package com.epam.core.codility;

import java.util.HashSet;
import java.util.Set;

/*
* Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
* */
public class MissingIntegers {

    public static void main(String[] args) {
        //int arr[] = {-1, 3, 6, 4, -1, 2};
        int arr[] = {1,2,3};
        int len = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int a : arr){
            set.add(a);
        }

        int missInt = 0;
        for (int i=0; i<len+1; i++){
            if (!set.contains(i+1)){
                missInt = i+1;
                break;
            }
            // handle
        }
        System.out.println("Missing min Int = "+ missInt);
    }
}
