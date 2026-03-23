package six.inbuilt;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicaateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n%2 == 0 ;
        System.out.println(isEven.test(10));

        BiPredicate<Integer,Integer> sumEven = (a,b) -> (a+b)%2 == 0;
        System.out.println("BI "+ sumEven.test(3,7));
    }
}
