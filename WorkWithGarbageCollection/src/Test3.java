public class Test3 {
    Test3(){
        System.out.println("Sozdalsya object"); // construction
    }
    void Test3(){
        System.out.println("Eto method!!!");
    }

    int Test3 = 3;


    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
