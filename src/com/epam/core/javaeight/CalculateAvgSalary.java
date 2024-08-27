package com.epam.core.javaeight;

import java.util.List;

public class CalculateAvgSalary {

    public static void main(String[] args) {
       List<Employee> employeeList =  DataSourceUtil.getEmployeeList();
       double avg = employeeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(avg);
    }
}
