package com.epam.core.design.factory;

public class FactoryPatternMainClass {

    public static void main(String[] args) {

        ProfessionFactory professionFactory = new ProfessionFactory();

        Profession profession = professionFactory.getProfessionFactory("engineer");
        profession.print();

        Profession teacher = professionFactory.getProfessionFactory("teacher");
        teacher.print();

        Profession doctor = professionFactory.getProfessionFactory("doctor");
        doctor.print();

    }
}
