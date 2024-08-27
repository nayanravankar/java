package com.epam.core.codility;

/*
* An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if it is possible to build a triangle with sides of lengths A[P], A[Q] and A[R]. In other words, triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
For example, consider array A such that:
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 12
There are four triangular triplets that can be constructed from elements of this array, namely (0, 2, 4), (0, 2, 5), (0, 4, 5), and (2, 4, 5).
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns the number of triangular triplets in this array.
For example, given array A such that:
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 12
the function should return 4, as explained above.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [0..1,000];
each element of array A is an integer within the range [1..1,000,000,000].
* */
public class CountTriangle {

    public static void main(String[] args) {

        int arr[] = {10,2,5,1,8,12};
        int len = arr.length;
        int count = 0;
        for (int p = 0; p<len-2 ;p++){
            int q = p+1;
            int r = q+1;
            if (greaterFun(arr[p], arr[q], arr[r]) && greaterFun(arr[q], arr[r], arr[p]) && greaterFun(arr[p], arr[r], arr[q])){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean greaterFun(int p, int q, int r){
        boolean isConsitionFulfill     = false;
        if ((p + q) > r){
            isConsitionFulfill     = true;
        }
        return isConsitionFulfill;
    }
}
