package com.epam.core.test;

public class Child extends Parent{

    @Override
    public void print() throws NullPointerException{
        System.out.println("in child print");
    }
}
