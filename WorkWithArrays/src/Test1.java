public class Test1 {
    public static void main(String[] args) {
        int [] arr1;
        String [] arr2;
        double [][] arr3;
        int [][] arr4;
        double [] arr5;

        // arr1 = new int[-3]; // exception
        arr2 = new String[10];
        arr3 = new double[3][3];
        arr4 = new int [3][];
        arr5 = new double[2];
        //static initialization
        arr2[0] = "privet";
        arr2[1] = "poka";
        arr2[2] = "ok";

        double [] arr6;
        arr6 = new double[2];
        arr6[0] = 2.5;
        arr6[1] = 3.5;
        arr5 = arr6;

        arr3[1] = arr5;

        System.out.println(arr2.length);

    }
}
