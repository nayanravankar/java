package com.epam.core.javaeight;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Grouping {

    public static void main(String[] args) {


        List<Employee> employeeList = DataSourceUtil.getEmployeeList();

        //find average salary of each department
        Map<String, Double> averageSalMap = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.averagingInt(Employee::getSalary)));

        System.out.println(averageSalMap.toString());

        //Average emp count in each department
        Map< String, Long > averageCpuntMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        System.out.println(averageCpuntMap);

        //Sort employee with name in sales department

        List<String> lst = employeeList.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("sales"))
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(lst);

        //find department with max no of employee

        Map.Entry<String, Long> entry = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue()).get();

        System.out.println(entry);

        //Find higest salary in each department

        Map<String, Optional<Employee>> higestSal = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(higestSal);

        //higestSal.forEach((s, employee) -> System.out.println("department "+s+", having higest salary for employee "+employee.get().getName()));


        //list of employee sort by salary
      Map<String,Integer> salaryMap = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toMap(Employee::getName,Employee::getSalary));

        System.out.println(salaryMap);

        //find employee with third largest salary
        Employee e = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .findFirst().get();

        System.out.println(e.getName());


        //get list of top 3 emp with higest salary
        List<String> emplst = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(emplst);

        //calculated total sum of salary of each department
        Map<String,Integer> sumMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getSalary)));

        System.out.println(sumMap);

        // group by department in accending order with name

        Map <String,List<Employee>> m1 = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(m1);


    }
}
