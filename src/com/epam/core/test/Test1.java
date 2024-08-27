package com.epam.core.test;

public interface Test1 {
    int add(int a , int b);

    default void hello(){
        System.out.println("interface test1");
    }
     public static void m1(){

    }
}
