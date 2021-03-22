package com;

public class Car {
    String color;
    String engine;
    public Car(){}
    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    final static int a = 5;

    public Car newCar(String color){
        Car c10 = new Car(color, "V8");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V20");
        Car c2 = c.newCar("black");
        System.out.println(c.color);
    }
}
