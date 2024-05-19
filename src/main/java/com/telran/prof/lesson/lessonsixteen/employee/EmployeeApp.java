package com.telran.prof.lesson.lessonsixteen.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeApp {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alex", "Developer", 2000),
                new Employee("Ken", "CEO", 15000),
                new Employee("Thomas", "Developer", 2500),
                new Employee("Oleg", "Manager", 3000),
                new Employee("Max", "Junior developer", 50));

        List<Employee> listOfCEO = employees.stream()
                .filter(employee -> "CEO".equals(employee.getPosition()))
                .collect(Collectors.toList());

        System.out.println("CEO list is " + listOfCEO);

        List<Employee> developerList = employees.stream()
                .filter(employee -> !"CEO".equals(employee.getPosition()))
                .filter(employee -> !"Manager".equals(employee.getPosition()))
                .collect(Collectors.toList());

        System.out.println("Developer list is " + developerList);

        Employee juniorDeveloper = employees.stream()
                .filter(employee -> !"CEO".equals(employee.getPosition()))
                .filter(employee -> !"Manager".equals(employee.getPosition()))
                .min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
                .orElse(null);

        System.out.println("Junior developer is " + juniorDeveloper);
    }
}