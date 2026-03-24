package six;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // stream --> Assemply line / pipeline

        List<String> items = Arrays.asList("apple", "banana","mango");
        for(String item : items){
            System.out.println(item);
        }

        Stream<String> stream = items.stream();
        stream.forEach((item) -> System.out.println(item));
        // stream.forEach(System.out::println);


//        Stream<String> stream1 = items.stream();
//        Stream <String> filteredStream
//                = stream1.filter(name -> name.startsWith("b"));
//        filteredStream.forEach(System.out::println);

        // optimized Stream
        items.stream()
        .filter(name -> name.startsWith("b"))
        .forEach(System.out::println);
    }
}
