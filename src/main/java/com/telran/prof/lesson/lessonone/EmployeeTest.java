package com.telran.prof.lesson.lessonone;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Alex Aleseev",35);
        Employee employeeTwo = new Employee("Oleg Olegov",20);

        employeeOne.setPosition("CEO");
        employeeTwo.setPosition("Clerk");

        String positionOne = employeeOne.getPosition();
        String positionTwo = employeeTwo.getPosition();
        System.out.println("PositionOne " + positionOne);
        System.out.println("PositionTwo " + positionTwo);

        employeeOne.printEmployeeInfo();
        employeeTwo.printEmployeeInfo();


    }
}
