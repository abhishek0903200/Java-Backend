package five;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a =5;
        // int b = 10/0;
        int[] z ={1,2,3};
        try{
            // EXCEPTION GENERATING STATEMENT
            int c = 10/0;

            System.out.println(z[6]);
            System.out.println("done");
        }catch (ArithmeticException e){
            // EXCEPTION HANDLING STATEMENT
            System.out.println("in catch block");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Exception");
        }finally{
            //ALWAYS EXCUTE
            System.out.println("Finally");
        }
        System.out.println("OUTSIDE TRY CATCH ");
    }
}
