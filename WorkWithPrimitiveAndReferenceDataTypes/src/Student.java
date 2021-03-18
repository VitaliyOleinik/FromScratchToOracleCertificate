public class Student {
    public String name;
    public int course;
    public double grade;
    Student(){}
    Student(String name, int course, double grade){
        this.course = course;
        this.name = name;
        this.grade = grade;
    }

    public static void swap(Student student1, Student student2){
        Student student3 = student1;
        student1 = student2;
        student2 = student3;
        System.out.println(student1.name);
        System.out.println(student2.name);
    }

    public static void changeName(Student student1){
        student1.name = "Arkady";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 3, 3.79);
        Student student2 = new Student("Petr", 2, 2.79);

        swap(student1, student2); // изменяются только копии объектов, так что результат будет прежний!

        System.out.println(student1.name + "    " + student2.name);

        changeName(student2);
        System.out.println(student2.name);
    }
}
