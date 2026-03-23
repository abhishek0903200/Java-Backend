package six;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.LockSupport;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FirstStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);


        List<Integer> evenNum = new ArrayList<>();
        for(int num : numbers){
            if(num % 2 == 0){
                evenNum.add(num);
            }
        }
        System.out.println("even no without num "+ evenNum);

        // iteration 2 smart & best
        List<Integer> stream1 = numbers.stream()
                .filter(n -> (n%2 == 0))
                .toList();
        System.out.println("for stream 2 "+ stream1);


        // iteration
        Stream<Integer> integerStream1 = numbers.stream();
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                int remainder = integer % 2;
                if(remainder == 0)
                    return true;
                return false;
            }
        };

        Predicate<Integer> p2 = n -> n %2 == 0;

        Stream<Integer> integerStream2 = integerStream1.filter(p2);
        List<Integer> evenNumber2 = integerStream2.toList();
        System.out.println("Even number 3 "+ evenNumber2);


    }
}
