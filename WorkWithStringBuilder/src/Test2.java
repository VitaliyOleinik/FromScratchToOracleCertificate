public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("42");
        sb2 = sb2.append("6").append("7");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2); // they are equals
    }
}
