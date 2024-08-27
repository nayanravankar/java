package com.epam.core.test;

public interface Test2 {
    int add(int a , int b);

    default void hello(){
        System.out.println("interface test1");
    }
}
