package com.epam.core.javaeight;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NthHigestSalary {

    public static void main(String[] args) {

        List<Employee> employeeList =  DataSourceUtil.getEmployeeList();

        /*List<Map.Entry<Integer, List<String>>> map = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getSalary(),
                        Collectors.mapping(employee -> employee.getName(),Collectors.toList())))
                        .entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList());
        System.out.println(map);*/

        Map.Entry<Integer, List<String>> entry = getNthHigestSalary(employeeList,4);

        System.out.println(entry);

       /* List<Map.Entry<Integer,List<String>>> abc = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getSalary(),
                        Collectors.mapping(employee -> employee.getName(), Collectors.toList())))
                        .entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList());*/
    }

    private static Map.Entry<Integer, List<String>> getNthHigestSalary(List<Employee> employeeList, int n) {
        Map.Entry<Integer, List<String>> entry = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getSalary(),
                        Collectors.mapping(employee -> employee.getName(),Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(n-1);
        return entry;
    }
}
