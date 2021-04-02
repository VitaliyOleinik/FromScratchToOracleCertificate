import javax.print.Doc;

public class Test1 {

    void incrementSalary(Employee e){
        e.salary = e.salary + 100;
    }

    public static void main(String[] args) {
        Human h = new Human("male");

        Doctor doctor = new Doctor();
        doctor.name = "Ivan";
        doctor.age = 50;
        doctor.experience = 25;
        doctor.specialization = "surgeon";
        doctor.eat();
        doctor.heal();
    }
}

class Employee{
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("Eat!");
    }
    void sleep(){
        System.out.println("Sleep!");
    }
}

class Doctor extends Employee{
    String specialization;
    void heal(){
        System.out.println("Heal!");
    }
}

class Surgeon extends Doctor{
    String skalpel;
    void operation(){
        // some code;
    }
}

class Teacher extends Employee{
    String cntOfStudents;
    void teach(){
        System.out.println("Teach!");
    }
}

class Driver extends Employee{
    String nameOfCar;
    void drive(){
        System.out.println("Drive!");
    }
}