public class Test5 {
    public static void main(String[] args) {
        int arr1 [] = {1, 9, 3, -8, 0, 5, 4, 1};
        int arr2 [] = {1, 9, 3, -8, 0, 5, 4, 1};
        int arr3 [] = arr2;
        System.out.println(arr1 == arr2); // false
        System.out.println(arr3 == arr2); // true
        System.out.println(arr1.equals(arr2)); // false
        arr1[0] = 0;
        arr2[5-3] = 3;
        arr1[arr1.length] = 10; // Exception ArrayIndexOutOfBoundsException

        int arr4[] = {3,5,6,0};
        int [] arr5 = new int[1];
        int [] arr6 = new int[] {};
    }
}
