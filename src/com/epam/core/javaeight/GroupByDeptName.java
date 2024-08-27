package com.epam.core.javaeight;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByDeptName {

    public static void main(String[] args) {

        List<Employee> employees = DataSourceUtil.getEmployeeList();

       /* groupByDepartment(employees);

        groupByDepartmentLambda(employees);

        filterEmployeeWithSalary(employees);

        //find list of emp leave in country India
        findEmpwithCountyCode(employees);*/

        //change salary of HR employee by 3000
        changeValueofList(employees);


    }

    private static void changeValueofList(List<Employee> employees) {

        // using map - map except return type
        List<Employee> lst = employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("HR"))
                .map(emp -> {
                    emp.setSalary(emp.getSalary() + 3000);
                    return emp;
                })
                .collect(Collectors.toList());

        System.out.println(lst);
        // another alternative is to use foreach in place of map to manipulate list itself

      employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("HR"))
                .forEach(employee -> employee.setSalary(employee.getSalary() + 3000));

        System.out.println("employees -> "+employees.toString());
    }

    private static void findEmpwithCountyCode(List<Employee> employees) {

        List<Employee> empLst = employees.stream().filter(employee -> employee.getAddress().getCountry().equalsIgnoreCase("India")).collect(Collectors.toList());
        System.out.println(empLst.toString());
    }

    private static void filterEmployeeWithSalary(List<Employee> employees) {

        //filter with salary more than 8000
        List<Employee> empLst =  employees.stream().filter(employee -> employee.getSalary()>5000 && employee.getAge()>25).collect(Collectors.toList());
        empLst.forEach((employee -> {
            System.out.println(employee.getName());
        }));
    }

    public static void groupByDepartment(List<Employee> employees){

        Map<String, List<Employee>> map = new HashMap<>();
        for (Employee employee : employees){
            List<Employee> empLst = map.getOrDefault(employee.getDepartment(), new ArrayList<Employee>());
            empLst.add(employee);
            map.put(employee.getDepartment(), empLst);
        }
        System.out.println(map.toString());

        map.forEach((dep, employeeList) -> {
            System.out.println("department "+dep);
            employeeList.forEach((employee -> {
                System.out.println(" "+ employee.toString());
            }));
        });
    }

    public static void groupByDepartmentLambda(List<Employee> employees){

        Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));

        map.forEach((dep, employeeList) -> {
            System.out.println("job title "+dep);
            employeeList.forEach((employee -> {
                System.out.println(" "+ employee.toString());
            }));
        });
    }
}
