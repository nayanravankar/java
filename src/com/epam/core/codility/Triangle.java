package com.epam.core.codility;

import java.util.Arrays;

/*
*
* An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
For example, consider array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
Triplet (0, 2, 4) is triangular.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
the function should return 1, as explained above. Given array A such that:

  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
*
* */
public class Triangle {


    public static void main(String[] args) {

        int arr[] = {10, 2, 5, 1, 8, 20};
        //int arr[] = {10, 50, 5, 1};
        int len = arr.length;

        Arrays.sort(arr); // sort so that in single loop we can test condition 0 ≤ P < Q < R < N
        boolean triangle = false;
        for (int p =0 ; p<len-2 ; p++){
            int q = p+1;
            int r = q+1;
            if (greaterFun(arr[p], arr[q], arr[r]) && greaterFun(arr[q], arr[r], arr[p]) && greaterFun(arr[p], arr[r], arr[q])){
               triangle = true;
                break;
            }
        }

        System.out.println("Triangle possile - "+triangle);
    }
    public static boolean greaterFun(int p, int q, int r){
        boolean isConsitionFulfill     = false;
        if ((p + q) > r){
            isConsitionFulfill     = true;
        }
        return isConsitionFulfill;
    }

}
