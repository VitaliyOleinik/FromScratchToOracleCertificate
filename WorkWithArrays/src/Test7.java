public class Test7 {
    public static void main(String[] args) {
        char [] array = {'p','r','i','v','e','t'};
        String s = new String(array);

        StringBuilder stringBuilder = new StringBuilder("Hello Vit");
        stringBuilder.append(array, 2, 3); // 2 -> i, 3 -> length
        System.out.println(stringBuilder);

        StringBuilder stringBuilder1 = new StringBuilder("privet");
        char [] array2 = {'p','r','i','v','e','t'};
        stringBuilder1.insert(1, array2, 2, 3);
        System.out.println(stringBuilder1);
    }
}
