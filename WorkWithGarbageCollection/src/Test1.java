public class Test1 {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(a < 4 ? 7 : "privet");

        int b = 5;
        int c = 5;
        int d = (a < 6) ? b++ : c++;
        System.out.println(b);
        System.out.println(c);

        int temp = 7;
        System.out.println(temp > 2 ? temp < 5 ? 3:6:9);
    }
}
