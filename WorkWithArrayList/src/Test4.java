import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = new StringBuilder("Hi");
        StringBuilder stringBuilder3 = new StringBuilder("Hey");
        list.add(stringBuilder1);
        list.add(stringBuilder2);
        list.add(stringBuilder3);
        list.add(new StringBuilder("Hi, there!"));
        list.get(1).append("!");
        for(int i = 0; i < list.size(); i++){
            list.get(i).append("!!!");
        }

        //list.remove(2);
        //list.remove("Hi");

        System.out.println(list.indexOf("Hello!!!"));

        //list.clear();

        for(StringBuilder s: list){
            System.out.println(s + " ");
        }
    }
}
