package com.epam.core.design.factory;

public class AbstractFactoryProducer {

    public static AbstractFactory getProfession(String prof){
        if (prof.equalsIgnoreCase("tranee")){
            return new ProfessionTraneeFactory();
        }
        else
        {
            return new ProfessionFactory();
        }
    }
}
