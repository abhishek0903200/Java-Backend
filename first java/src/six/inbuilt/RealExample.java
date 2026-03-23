package six.inbuilt;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class RealExample {
    public static void main(String[] args) {
        //<title> cost $ <price>

        BiFunction <String,Integer,String> formatter = (title, price) -> (title + "book cost $ "+ price);
        System.out.println(formatter.apply("java bsics",300));

        BiConsumer<String,Integer> formatterConsumer = (title,price) -> System.out.println(title+ "book cost $ "+ price);
        formatterConsumer.accept("java basics",200);
    }
}
