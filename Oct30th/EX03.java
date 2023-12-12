package Oct30th;

import com.sun.jdi.PathSearchingVirtualMachine;

public class EX03 {
    public static void main(String[] args) {
       //When system exit is not present
        try{
            int a=20/5;
        }
        catch(Exception b) {
            System.out.println(b.getMessage());
        }
        finally{
            System.out.println("closing it");
        }
        System.out.println("code is working fine");
        }

//When system exit is present

        try {
            int a = 20 / 0;
        } catch (Exception b) {
            System.out.println(b.getMessage());
            System.exit(-1);
        } finally {
            System.out.println("closing it");
        }

    }
    }
