package homeWork;

public class SumClass {
    public int sum(){
        return 0;
    }
    public int sum(int i1){
        return sum() + i1;
    }
    public int sum(int i1, int i2){
        return sum(i1) + i2;
    }
    public int sum(int i1, int i2, int i3){
        return sum(i1, i2) + i3;
    }
    public int sum(int i1, int i2, int i3, int i4){
        return sum(i1, i2, i3) + i4;
    }
}

class SumClassTest{
    public static void main(String[] args) {
        SumClass sumClass = new SumClass();
        System.out.println(sumClass.sum());
        System.out.println(sumClass.sum(1));
        System.out.println(sumClass.sum(1, 2));
        System.out.println(sumClass.sum(1, 2, 3));
        System.out.println(sumClass.sum(1, 2, 3, 4));
    }
}