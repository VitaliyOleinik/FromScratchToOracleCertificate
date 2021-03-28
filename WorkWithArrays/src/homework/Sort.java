package homework;

public class Sort {
    public static int[] sortirovka(int [] array){
        int a;
        for (int i = 0; i < array.length; i++){
            int min = array[i];
            int index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    index = j;
                }
            }
            if(i != index){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int arr2 [] = {1, 9, 3, -8, 0, 5, 4, 1};
        sortirovka(arr2);
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + "; ");
        }
    }
}
