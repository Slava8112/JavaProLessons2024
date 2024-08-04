package com.telran.prof.lesson.lessonone;

public class Employee {
     private String name;
    private int age;
    private String position;
    private double salary;

    public Employee(String employeeName,int employeeAge) {
        name = employeeName;
        age = employeeAge;
    }

    public void setPosition(String positionEmployee){
        position = positionEmployee;
    }
    public String getPosition(){
        return position;
    }
    private void multiplySalary(){
        salary = salary * 2;
    }

    public void printEmployeeInfo(){
        System.out.println("Name =" + name);
        System.out.println("Age =" + age);
        System.out.println("Position =" + position);
        System.out.println("Salary =" + salary);
    }
}
