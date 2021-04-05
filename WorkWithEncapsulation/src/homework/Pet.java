package homework;

public class Pet extends Animal{
    private String name;
    private int tail;
    private int paw;
    Pet(String name){
        super(2);
        this.name = name;
        this.tail = 1;
        this.paw = 4;
        System.out.println("I am pet");
    }
    public void run(){
        System.out.println("Pet runs!");
    }
    public void jump(){
        System.out.println("Pet jumps!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }
}
