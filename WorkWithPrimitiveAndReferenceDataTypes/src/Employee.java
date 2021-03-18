public class Employee {
    public String name;
    public double salary;

    Employee(){}
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double increase(double a){
        return a * 2;
    }

    public double xp2(){
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", 100.55);
        double d = employee1.increase(employee1.salary);
        System.out.println(d);
        System.out.println(employee1.salary);
        employee1.xp2();
        System.out.println(employee1.salary);
    }
}
