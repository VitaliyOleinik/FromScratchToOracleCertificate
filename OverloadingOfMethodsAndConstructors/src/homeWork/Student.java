package homeWork;

public class Student {
    int id;
    String name;
    String surname;
    int course;
    String department;

    public Student(int id, String name, String surname, int course, String department){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.department = department;
    }

    public Student(int id, String name, String surname, int course){
        this(id, name, surname, course, null);
    }

    public Student(String name, String surname){
        this(0, name, surname, 0, null);
    }

    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", department='" + department + '\'' +
                '}';
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Vitaliy", "Oleinik");
        Student s3 = new Student(1, "Arkadiy", "Luit", 1);
        Student s4 = new Student(1, "Gosha", "Rub4inskiy", 2, "Fit");
        System.out.println(s1.toString() + "\n" +
                s2.toString() + "\n" +
                s3.toString() + "\n" +
                s4.toString());
    }
}