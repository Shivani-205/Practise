package Oct30th;

import java.sql.SQLOutput;

public class EX02 {
    public static void main(String[] args) {
        Again forr=new Again();
        forr.show();
        System.out.println("Code is correct");
    }
}

    class Again {
        int a = 20;

        int show() {

            try {
                int a = 10 / 0;
            } catch (Exception e) {
                try {
                    int a = 20 / 0;
                } catch (Exception b) {
                    System.out.println(b.getMessage());
                }

            }
            System.out.println("In Catch" + a);
            return a;
        }
    }


