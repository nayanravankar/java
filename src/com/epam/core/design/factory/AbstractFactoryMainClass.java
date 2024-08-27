package com.epam.core.design.factory;

public class AbstractFactoryMainClass {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession("tranee");
        Profession profession = abstractFactory.getProfessionFactory("doctortr");
        profession.print();

        AbstractFactory abstractFactoryDoc = AbstractFactoryProducer.getProfession("doctor");
        Profession doctor = abstractFactoryDoc.getProfessionFactory("doctor");
        doctor.print();
    }
}
