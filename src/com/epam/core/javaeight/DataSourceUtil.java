package com.epam.core.javaeight;

import java.util.ArrayList;
import java.util.List;

public class DataSourceUtil {

    public static List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();

        Address address1 = new Address("dwx", "12", "India", "455001");
        Address address2 = new Address("dwx", "12", "UK", "455001");
        Address address3 = new Address("dwx", "12", "US", "455001");
        Address address4 = new Address("dwx", "12", "Aus", "455001");

        employees.add(new Employee("John", 1,"IT","Engineer", 30, 24000, address1));
        employees.add(new Employee("Nayan", 2,"IT","Engineer", 40, 10000, address1));
        employees.add(new Employee("Shal", 3,"sales","tester", 45, 15000, address2));
        employees.add(new Employee("Marcus", 4,"OPS","Manager", 22, 20000, address2));
        employees.add(new Employee("Vidhya", 5,"HR","executive", 23, 5000, address3));
        employees.add(new Employee("advika", 8,"HR","executive", 23, 50100, address4));
        employees.add(new Employee("advika1", 9,"sales","executive", 44, 50010, address4));
        employees.add(new Employee("advika2", 10,"sales","executive", 22, 50020, address4));


        employees.add(new Employee("advika", 1,"IT","Engineer", 30, 24000, address1));
        employees.add(new Employee("shalini", 2,"IT","Engineer", 40, 10000, address1));
        employees.add(new Employee("dau", 1,"IT","Engineer", 30, 24000, address1));
        employees.add(new Employee("dai", 2,"IT","Engineer", 40, 10000, address1));
        employees.add(new Employee("nayan", 1,"IT","Engineer", 30, 24000, address1));
        employees.add(new Employee("papai", 2,"IT","Engineer", 40, 10000, address1));

        return employees;
    }
}
