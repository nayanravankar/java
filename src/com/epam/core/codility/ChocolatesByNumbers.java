package com.epam.core.codility;

import java.util.HashSet;
import java.util.Set;

/*
* Two positive integers N and M are given. Integer N represents the number of chocolates arranged in a circle, numbered from 0 to N − 1.

You start to eat the chocolates. After eating a chocolate you leave only a wrapper.

You begin with eating chocolate number 0. Then you omit the next M − 1 chocolates or wrappers on the circle, and eat the following one.

More precisely, if you ate chocolate number X, then you will next eat the chocolate with number (X + M) modulo N (remainder of division).

You stop eating when you encounter an empty wrapper.

For example, given integers N = 10 and M = 4. You will eat the following chocolates: 0, 4, 8, 2, 6.

The goal is to count the number of chocolates that you will eat, following the above rules.

Write a function:

class Solution { public int solution(int N, int M); }

that, given two positive integers N and M, returns the number of chocolates that you will eat.

For example, given integers N = 10 and M = 4. the function should return 5, as explained above.

Write an efficient algorithm for the following assumptions:

N and M are integers within the range [1..1,000,000,000].
* */
public class ChocolatesByNumbers {

    public static void main(String[] args) {

        int n = 10;
        int m = 4;

        Set<Integer> set  = new HashSet<>();

        //set.add(0);
        int i=0;
       while ( set.add(i)){
           i=i+m;
           if ( i>=n)
               i = Math.abs(i-n-m);

       }

        System.out.println("indexx choclate eaten - "+set.toString());
        System.out.println("no of choaclate - "+set.size());


    }
}
