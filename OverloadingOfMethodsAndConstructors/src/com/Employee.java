package com;

public class Employee {

    Employee(int id2, String surname2, int age2){
//        id = id2;
//        surname = surname2;
//        age = age2;

//        this(surname2, age2);
//        this.id = id2;

        this(surname2, id2, age2, 0.0, null);
    }

    Employee(String surname3, int age3){
//        this.surname = surname3;
//        this.age = age3;
        this(surname3, 0, age3, 0.0, null);
    }

    Employee(String surname1, int id1, int age1, double salary1, String department1){
//        this(id1, surname1, age1);
//        this.salary = salary1;
//        this.department = department1;
        this.id = id1;
        this.salary = salary1;
        this.department = department1;
        this.age = age1;
        this.surname = surname1;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ivanov", 25);
        System.out.println(employee.id);
        Employee employee1 = new Employee("Petrov", 30);
        System.out.println(employee1.surname);
        Employee employee2 = new Employee("Sidorov", 2, 28, 1000, "Fit");
        System.out.println(employee2.salary);
    }
}
