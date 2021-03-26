package homework;

public class Equal {
    public static boolean equality(StringBuilder sb1, StringBuilder sb2){
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }else return false;
    }
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean result = true;
        if (sb1.length() == sb2.length()){
            for (int i = 0; i < sb1.length(); i++){
                if(sb1.charAt(i) != sb2.charAt(i)){
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
class TestEqual{
    public static void main(String[] args) {
        System.out.println(Equal.equality(new StringBuilder("123"), new StringBuilder("123")));
        System.out.println(Equal.ravenstvo(new StringBuilder("124"), new StringBuilder("123")));
    }
}
