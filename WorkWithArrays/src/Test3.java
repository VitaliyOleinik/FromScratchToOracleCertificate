public class Test3 {
    static String s;
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        //arr[3] = 1; // Exception ArrayIndexOutOfBoundsException 3

        int[][] arr2 = new int[3][];
        // System.out.println(arr2[0][1]); // Exception NullPointerException

        System.out.println(s.length()); // Exception NullPointerException
    }
}
