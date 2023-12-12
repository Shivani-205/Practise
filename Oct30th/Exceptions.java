package Oct30th;


public class Exceptions {
    public static void main(String[] args) {
        String name=null;// NullPointerException
        try {
            name.trim();
        }
       /* catch (Exception e){
            System.out.println(e.getMessage());
        }*/
        catch(Exception e){
            System.out.println(e.getMessage());
            //System.out.println(e.getMessage());
        }
        System.out.println("Code is working fine");
    }


}
