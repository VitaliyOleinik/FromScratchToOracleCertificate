package homework;

public class Dog extends Pet{

    Dog(String name){
        super(name);
        System.out.println("I am dog and my name is " + name);
    }
    public void play(){
        System.out.println("Dog plays!");
    }
}
