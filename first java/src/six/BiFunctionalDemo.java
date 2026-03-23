package six;

import java.sql.SQLOutput;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionalDemo {

    public static BiFunction<Integer,Integer,Integer> addFunction
            //= (a,b) -> a+b;
            =Integer::sum;

    public static BiFunction<Integer,Integer,Integer> subFunction
            = (a,b) -> a-b;

    public static void main(String[] args) {
        System.out.println(addFunction.apply(10,3));
        System.out.println(subFunction.apply(10,3));

        Function<Integer,Integer> multiplyby2 = x -> x*2;
        BiFunction<Integer,Integer,Integer> combinedFunction =
                addFunction.andThen(multiplyby2);

        System.out.println(combinedFunction.apply(5,2));
    }

}
