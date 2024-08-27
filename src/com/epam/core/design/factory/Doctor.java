package com.epam.core.design.factory;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("I'm a Doctor");
    }
}
