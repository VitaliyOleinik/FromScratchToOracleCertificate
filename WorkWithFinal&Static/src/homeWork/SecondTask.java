package homeWork;

public class SecondTask {
    static final double PI = 3.14;

    double areaOfCircle(double radius){
        return PI * Math.pow(radius, 2);
    }

    static double lengthOfCircle(double radius){
        return 2 * PI * radius;
    }

    void info(double radius){
        System.out.println(areaOfCircle(radius) + "\n" +
                lengthOfCircle(radius) + "\n" +
                radius);
    }
}

class SecondTaskTest{
    public static void main(String[] args) {
        SecondTask secondTask = new SecondTask();
        secondTask.info(3);
    }
}
