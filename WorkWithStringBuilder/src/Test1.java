class Car{
    @Override
    public String toString() {
        return "I'm new CAR!!!!";
    }
}
public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Goood day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.length());
        System.out.println(sb3.length());
        System.out.println(sb2.charAt(4)); // space between words

        System.out.println(sb2.indexOf(" ")); // 4
        System.out.println(sb2.indexOf("z")); // -1 -> not found
        System.out.println(sb2.indexOf("oo", 2)); // start with index = 2

        String s = sb2.substring(6);
        System.out.println(s);
        String s2 = sb2.substring(6, 9);
        System.out.println(s2);

        System.out.println(sb2.subSequence(6, 9)); // like substring, only output = CharSequence

//        sb2.append(22);
//        System.out.println(sb2);
//        sb2.append(true);
//        System.out.println(sb2);
//        sb2.append(sb2);
//        System.out.println(sb2);
//        sb2.append("HELLO!");
//        System.out.println(sb2);
//        sb2.append(new Car());
//        System.out.println(sb2);

        System.out.println(sb2.insert(5, "42"));
        System.out.println(sb2.insert(sb2.length(), "Hello"));

        StringBuilder sb10 = new StringBuilder("Hello World");
        // sb10.delete(3, 6);
        sb10.deleteCharAt(6);
        System.out.println(sb10);
        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0, 4, "Vitaliy");
        System.out.println(sb12);
        System.out.println(sb12.capacity());
        System.out.println(sb1.capacity());

    }
}
