package homework;

public class Cat extends Pet{
    Cat(String name){
        super(name);
        System.out.println("I am Cat and my name is " + name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
