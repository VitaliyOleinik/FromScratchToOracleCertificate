package homework;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public ArrayList<String> abc(String ... s){
        ArrayList<String> arrayList = new ArrayList<>();
        for(String s1: s){
            if(!arrayList.contains(s1))
                arrayList.add(s1);
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.abc("priv", "OK", "ok", "BYE", "poka", "poka");
    }
}
