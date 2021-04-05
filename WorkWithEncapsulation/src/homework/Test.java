package homework;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Ramka");
        System.out.println("I have " + dog.getPaw() + " paws");
        Cat cat = new Cat("Listik");
        cat.sleep();
    }
}
