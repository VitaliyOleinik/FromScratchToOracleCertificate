public class Test6 {
    public static void maxMix(double [] array){
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Min: " + min + ". Max: " + max);
    }

    public static void main(String[] args) {
        maxMix(new double[]{1,2,3,4,5,6,32,765,123, -123});
    }
}
