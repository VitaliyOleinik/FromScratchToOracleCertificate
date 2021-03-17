package com;

public class Student {
    String name;
    int course;
    static int cnt;
    int a;

    public Student(String name2, int course2){
        cnt++;
        name = name2;
        course = course2;
        System.out.println("Student id: " + cnt);
    }

    public static  void showCount(){
        System.out.println("all id: " + cnt);
    }

    public void showInfo(){
        System.out.println("Welcome to the Student class!");
    }

    void abc(){
        a++;
        cnt++;
    }

    static void abcd(){
        cnt++;
    }
}

class StudentTest{
    void firstExample(){
        Student student1 = new Student("Ivan", 1);
        Student student2 = new Student("Petr", 3);
        Student student3 = new Student("Masha", 2);

        System.out.println(student1.name);
        System.out.println(Student.cnt);
        Student.showCount();
    }


    public static void main(String[] args) {

    }
}