package five;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a =5;
        // int b = 10/0;

        try{
            // EXCEPTION GENERATING STATEMENT
            int c = 10/0;
            System.out.println("done");
        }catch (Exception e){
            // EXCEPTION HANDLING STATEMENT
            System.out.println("in catch block");
        }
    }
}
