public class Test6 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        String[] array2 = {"Vit", "Vit", "Vit"};

        for(String s: array2){
            s = new String("Hello"); // not work
        }

        for(int i: array){
            i = 3; // not work
        }

        for(int i = 0; i < array.length; i++){
            array[i] = 3;
        }

        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
