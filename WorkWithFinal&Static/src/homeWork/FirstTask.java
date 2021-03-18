package homeWork;

public class FirstTask {
    public static int multipleOfThree(int first, int second, int third){
        return first * second * third;
    }
    public static void divideFirstToSecond(int first, int second){
        int result = first / second;
        int remainder = first % second;
        System.out.println("Main part: " + result + ". Remainder: " + remainder);
    }
    public int sum(int a, int b){
        return a + b;
    }
}

class FistTaskTest{
    public static void main(String[] args) {
        int a = FirstTask.multipleOfThree(2, 2, 2);
        int b = FirstTask.multipleOfThree(3, 3, 3);
        System.out.println(FirstTask.multipleOfThree(2, 2, 2) + "       "
                + FirstTask.multipleOfThree(3, 3, 3));
        System.out.println(a + "        " + b);
        FirstTask.divideFirstToSecond(b, a);
    }
}
