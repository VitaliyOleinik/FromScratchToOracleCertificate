public class NewHuman {
    public NewHuman(String name){
        this.name = name;
    }
    public String name;
    public static int salary = 150;
    public void work(){
        System.out.println("work");
    }
    public static void rest(){
        System.out.println("rest");
    }
}

class Student extends NewHuman{
    public Student(String name) {
        super(name);
    }
    public static void main(String[] args) {
        Student s = new Student("name");
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
