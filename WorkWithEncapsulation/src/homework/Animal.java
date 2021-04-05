package homework;

public class Animal {
    private int eyes;
    Animal(int eyes){
        System.out.println("I am animal!");
        this.eyes = eyes;
    }
    public void eat(){
        System.out.println("Animal eats!");
    }
    public void drink(){
        System.out.println("Animal drinks!");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
