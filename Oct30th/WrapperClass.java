package Oct30th;
//For converting Primitive data type to class and object we use wrapper class
//Each primitive data type has its own wrapper class

import java.sql.SQLOutput;

public class WrapperClass {
    public static void main(String[] args) {
        //Primitive to string - Two ways to convert primitve to string
        int AB=123;
        String S1= String.valueOf(AB);
        System.out.println(S1+S1);

        String S2= Integer.toString(AB);
        System.out.println(S2+S2);



        String ABB="400";
        Integer AB1= Integer.parseInt(ABB);
        System.out.println(AB1+AB1);


        //String to Primitive



    }
}
