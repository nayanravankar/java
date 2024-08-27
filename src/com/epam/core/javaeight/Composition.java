package com.epam.core.javaeight;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Composition {

    public static void main(String[] args) {

        List<Employee> empLst =  DataSourceUtil.getEmployeeList();

        // give list of emp in upper case and reverse order

        //create function to get names, first argument will be input and second withh be string name output
        Function<Employee, String> getName = emp -> emp.getName();
        //create another function to reverse string
        Function<String,String> reverse = str-> new StringBuilder(str).reverse().toString();

        //create another function for upper case
        Function<String, String> upperCase = str-> str.toUpperCase();

        // use all funtion together in map with composition of andThen
        List<String> empNames = empLst.stream()
                .map(getName.andThen(upperCase.andThen(reverse)))
                .collect(Collectors.toList());

        System.out.println("emp NAme "+ empNames.toString());

        List<String> empComp = empLst.stream()
                .map(getName).map(upperCase.compose(reverse))
                .collect(Collectors.toList());

        System.out.println("Comp NAme "+ empComp.toString());
    }
}
