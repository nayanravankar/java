package com.epam.core;

interface Interface1{

    void print();
    default void hello(){
        System.out.println("in interface 1");
    }
    default void hi(){
        System.out.println("in hi 1");
    }

    public static void main(String[] args){
        System.out.println("in interface 1 main");
    }
}
interface Interface2{
    void print();

    default void hi(){
        System.out.println("in hi 1");
    }

    default void hello(){
        System.out.println("in interface 2");
    }
}

public class DefaultnterfaceImpl implements Interface1, Interface2{

    @Override
    public void print() {
        System.out.println("print IMPL");
    }

    @Override
    public void hello() {
        System.out.println("In child method");
        Interface1.super.hello();
    }

    @Override
    public void hi() {
        Interface1.super.hi();
    }

    public static void main(String[] args) {
        DefaultnterfaceImpl defaultnterface = new DefaultnterfaceImpl();
        defaultnterface.hello();
    }
}
