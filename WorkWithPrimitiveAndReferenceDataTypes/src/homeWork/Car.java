package homeWork;

public class Car {
    String color;
    String engine;
    int cntOfDoors;

    public Car(){}

    public Car(String color, String engine, int cntOfDoors) {
        this.color = color;
        this.engine = engine;
        this.cntOfDoors = cntOfDoors;
    }
}

class CarTest{
    static void changeCntOfDoors(Car c, int cnt){
        c.cntOfDoors = cnt;
        System.out.println(c.cntOfDoors);
    }

    static void changeColor(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;

    }

    public static void main(String[] args) {
        Car car1 = new Car("pink", "v6", 4);
        Car car2 = new Car("black", "v8", 2);

        System.out.println("1 car " + car1.color + "  . 2 Car " + car2.color);
        changeColor(car1, car2);
        System.out.println("1 car " + car1.color + "  . 2 Car " + car2.color);
        changeCntOfDoors(car1, 5);
        System.out.println(car1.cntOfDoors + "   " + car2.cntOfDoors);
    }
}
