package com;

public class Car {
    public String color = "blue";
    public String engine = "V8";
}

class Human{
    String name = "Ivan";
    final Car car = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        // h1.car = new Car(); // Error. final Car car
        // h1.car = new Car(); // Error
        h1.car.engine = "V12";
    }
}