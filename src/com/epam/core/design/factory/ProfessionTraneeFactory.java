package com.epam.core.design.factory;

public class ProfessionTraneeFactory extends AbstractFactory{
    public Profession getProfessionFactory(String profession){

        if (profession==null){
            return null;
        } else if ("doctortr".equalsIgnoreCase(profession)) {
            return new DoctorTraniee();
        }
        else if ("engineertr".equalsIgnoreCase(profession)) {
            return new EngineerTraniee();
        }
        else  {
            return null;
        }
    }
}
