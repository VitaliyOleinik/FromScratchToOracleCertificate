import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student student = new Student();
        list.add(student);
        list.add(new StringBuilder("ok"));
    }
}
class Student{}
class Car{}
