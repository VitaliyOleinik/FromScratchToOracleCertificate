public class Student {
    private int id;
    private String name;
    private int age;
    private int course;

    public Student() {
    }

    public Student(int id, String name, int age, int course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public static void check1(Student student1, Student student2){
        if(student1.name.equals(student2.name) && student1.course == student2.course &&
                student1.age == student2.age && student1.id == student2.id){
            System.out.println("Students are equals");
        }else {
            System.out.println("Not equals");
        }
    }

    // using nested if
    public static void check2(Student student1, Student student2){
        if(student1.name.equals(student2.name)){
            if(student1.course == student2.course){
                if(student1.id == student2.id){
                    if(student1.age == student2.age){
                        System.out.println("Name, course, id, age of students are equals");
                    }
                    System.out.println("Name, course, id of students are equals");
                }
                System.out.println("Name, course of students are equals");
            }
            System.out.println("Name of students are equals");
        }
    }

}

class StudentTest{

    public static void main(String[] args) {
        Student student1 = new Student(1, "Vit", 20, 3);
        Student student4 = new Student(1, "Vit", 20, 3);
        Student student2 = new Student(2, "Vit1", 20, 2);
        Student student3 = new Student(3, "Vit1", 20, 1);

        Student.check1(student1, student4);
        Student.check2(student2, student3);
    }
}
