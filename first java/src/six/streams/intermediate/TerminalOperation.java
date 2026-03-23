package six.streams.intermediate;

import com.sun.source.doctree.EscapeTree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TerminalOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);

        // reduce
        int sum = numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);

        //collect
        List<Integer> evenNum = numbers.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even number "+ evenNum);

        numbers.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList())
                .forEach(n -> System.out.print(n + " "));

        // find and match
        System.out.println("abhishek");
        System.out.println(numbers.stream().findFirst().get());
        System.out.println("maurya");
        System.out.println(numbers.stream().findAny().get());

        boolean has40 = numbers.stream()
                .anyMatch(n -> n == 40);
        System.out.println(has40);

    }
}
