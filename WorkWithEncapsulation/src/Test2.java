public class Test2 {

}

class Human2 {
    String name = "Alex";
    String surname;
//    Human2(String name){
//        this(name, null);
//    }
//    Human2(String name, String surname){
//        this.name = name;
//        this.surname = surname;
//    }
    Human2(String n){
        this.name = n;
    }
}

class Student2 extends Human2{
//    Student2(){
//        this(5);
//        System.out.println("Hello");
//    }
//    Student2(int i){
//        super("Petya");
//    }
    Student2(String s){
        super(s);
        System.out.println("hi");
    }
    public static void main(String[] args) {
        Student2 s = new Student2("ok");
    }
}
