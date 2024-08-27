package com.epam.core.codility;

public class Factorial {
    public static void main(String[] args) {

        int n =5;
        System.out.println(fact(5));

        printFibonnaci(10);
    }

    public  static int fact(int n){
        if (n ==0 )
            return 1;
        System.out.println(n);
        return n* fact(n-1);

    }

    public static void printFibonnaci( int n){

        int a =0; int b =1;
        System.out.println(a+ " "+ b);

        for (int i=2; i<= n; i++){
            int next = a+b;
            System.out.println(next+ " ");
            a= b;
            b=next;
        }
    }



}
