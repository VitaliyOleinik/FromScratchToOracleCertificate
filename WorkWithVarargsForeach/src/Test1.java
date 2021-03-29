public class Test1 {
    public static void sum(String s, int ... a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println(sum);
        System.out.println(s);
    }
    public void abc(int[] ... array){
        // люое количество массивов
    }
    public static void main(String[] args) {
        sum("ok", 4, 6);
        sum("ok!", new int[]{1, 2, 3});
    }
}
