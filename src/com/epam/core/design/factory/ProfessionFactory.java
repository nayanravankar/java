package com.epam.core.design.factory;

import java.security.PublicKey;

public class ProfessionFactory extends AbstractFactory{


    public Profession getProfessionFactory(String profession){

        if (profession==null){
            return null;
        } else if ("doctor".equalsIgnoreCase(profession)) {
            return new Doctor();
        }
        else if ("engineer".equalsIgnoreCase(profession)) {
            return new Engineer();
        }
        else if ("teacher".equalsIgnoreCase(profession)) {
            return new Teacher();
        }
        else  {
            return null;
        }
    }

}
