import java.util.Arrays;
public class Test4 {
    public static void main(String[] args) {
        int arr1 [] = {1, 9, 3, -8, 0, 5, 4, 1};
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr1);
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int index1 = Arrays.binarySearch(arr1, 5);
        System.out.println(index1);
    }
}
