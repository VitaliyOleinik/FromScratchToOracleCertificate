import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("Bye"));
        list.add(new String("Ok"));
        list.add(new String("Privet"));
        list.add(new String("Hello"));
        list.add(new String("Privet"));
        list.add(new String("Privetiki"));
//        for(String s: list){
//            System.out.println(s + " ");
//        }

        System.out.println(list.toString());

        System.out.println(list.indexOf(new String("Privet")));
        System.out.println(list.lastIndexOf(new String("Privet")));

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println(list.contains("Bye"));
    }
}
