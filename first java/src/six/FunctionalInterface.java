package six;

// functional interface allows only one abstract method &
// u can use lambda expression to make it easy

@java.lang.FunctionalInterface
interface BookAction{
    void perform();
}

@java.lang.FunctionalInterface
interface Operation{
    int add(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
//        Step 1
//        BookAction action = new BookAction() {
            //            @Override
//            public void perform() {
//                System.out.println("Action performed");
//            }
//        };
//        action.perform();


//            Step 2 Lambda
        BookAction action = () -> System.out.println("Action Performed ");
        action.perform();

//        Operation operation1 = new Operation() {
//            @Override
//            public int add(int a, int b) {
//                return 0;
//            }
//        };

        Operation addition = (int a, int b) -> {
            return (a+b);
        };
        System.out.println(addition.add(2,3));

//

    }
}
