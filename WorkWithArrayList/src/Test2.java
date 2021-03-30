import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("poka");
        list.add("ok!");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("OOOO"));
        ArrayList<String> list2 = new ArrayList<>(30); // 30 -> capacity
        ArrayList<String> list3 = new ArrayList<>(list2); // list3 = list2, но будут разные ссылки
        System.out.println(list2 == list3);
        int[] a = new int[]{1,2,3,4,5};
        for(int i = a.length - 1; i >= 0; i--){
            System.out.println(a[i]);
        }
    }
}
