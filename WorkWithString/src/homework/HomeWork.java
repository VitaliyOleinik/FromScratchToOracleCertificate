package homework;

public class HomeWork {
    public void email(String emails){
        int a = 0; // position of symbol @
        int b = 0; // position of symbol .
        int c = 0; // position of symbol ;
        while (c < emails.length() - 1){
            a = emails.indexOf('@', c);
            b = emails.indexOf('.', c);
            c = emails.indexOf(';', c + 1);
            System.out.println(emails.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        HomeWork hw = new HomeWork();
        hw.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
