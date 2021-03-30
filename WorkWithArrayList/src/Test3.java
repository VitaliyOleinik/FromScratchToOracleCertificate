import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("-Bye");
        list.add(0, "-Hi!");
        list.add("ok");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(0, 2);

        System.out.println();
        System.out.println(list.get(1).getClass());

        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        list.set(2, "!!!");
        for(String s: list){
            System.out.print(s + " ");
        }
    }
}
