package com;

class Employee{
    double salary;
    boolean isManager;
    Employee(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employee employee = new Employee(1234, true);
        System.out.println("On manager? " + employee.isManager + ". His salary?" + employee.salary);
    }
}