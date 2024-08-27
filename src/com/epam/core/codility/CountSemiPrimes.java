package com.epam.core.codility;

/*
* A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.

A semiprime is a natural number that is the product of two (not necessarily distinct) prime numbers. The first few semiprimes are 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.

You are given two non-empty arrays P and Q, each consisting of M integers. These arrays represent queries about the number of semiprimes within specified ranges.

Query K requires you to find the number of semiprimes within the range (P[K], Q[K]), where 1 ≤ P[K] ≤ Q[K] ≤ N.

For example, consider an integer N = 26 and arrays P, Q such that:

    P[0] = 1    Q[0] = 26
    P[1] = 4    Q[1] = 10
    P[2] = 16   Q[2] = 20
The number of semiprimes within each of these ranges is as follows:

(1, 26) is 10,
(4, 10) is 4,
(16, 20) is 0.
Write a function:

class Solution { public int[] solution(int N, int[] P, int[] Q); }

that, given an integer N and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M elements specifying the consecutive answers to all the queries.

For example, given an integer N = 26 and arrays P, Q such that:

    P[0] = 1    Q[0] = 26
    P[1] = 4    Q[1] = 10
    P[2] = 16   Q[2] = 20
the function should return the values [10, 4, 0], as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..50,000];
M is an integer within the range [1..30,000];
each element of arrays P and Q is an integer within the range [1..N];
P[i] ≤ Q[i].
* */

import java.util.*;

public class CountSemiPrimes {

    public static void main(String[] args) {
        int arr1[] = {1,4,16};
        int arr2[] = {26,10,20};
        int len = arr2.length; // considering both as same length

        int output[] = new int[len];
        int minRange = Integer.MAX_VALUE, maxrange = 0;

        for (int i=0; i<len; i++){
            if (arr1[i] < minRange)
                minRange=arr1[i];
            if (arr2[i] > maxrange)
                maxrange = arr2[i];
        }
        List<Integer> primeList = findPrimeNoInRange(minRange,maxrange);
        Set<Integer> semiPrime = new HashSet<>();
        for (int i=0; i< primeList.size();i++){
            for (int j =0; j< primeList.size(); j++){
                int semiprod = primeList.get(i)*primeList.get(j);
                if (semiprod <= maxrange){
                    semiPrime.add(semiprod);
                }
            }
        }
        System.out.println(semiPrime);

        for (int k=0; k<len; k++){
                int count =0;
                for (Integer i : semiPrime){
                    if ((i>= arr1[k]) &&  (i<= arr2[k]) ){
                        count++;
                    }
                }
                output[k] = count;
        }

        System.out.println("Arrays output - "+ Arrays.toString(output));


    }
    public static List<Integer> findPrimeNoInRange(int a, int b ){
        //considering a < b
        List<Integer> prime = new ArrayList<>();

        for (int i=a; i<=b; i++){
            if (isPrime(i)){
                prime.add(i);
            }
        }
        System.out.println(prime);
        return prime;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
