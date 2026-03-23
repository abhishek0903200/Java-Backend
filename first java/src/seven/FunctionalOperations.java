package seven;

import java.util.Optional;

public class FunctionalOperations {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");
        Optional<String > nullOpt = Optional.ofNullable(null);

        //ifPresent()
        name.ifPresent((value) -> {
            System.out.println(value);
            System.out.println("hey");
        });

        nullOpt.ifPresent((value) -> {
            System.out.println(value);
            System.out.println("hey");
        });

        // map
        Optional <String> upperCase = name.map(value -> value.toUpperCase());
        System.out.println(upperCase.orElse("default"));

        //filter
        Optional<String> temp =  name.filter(n -> n.startsWith("F"));
        temp.ifPresent(System.out::println);

        //Combined Operation
        name.filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);


    }
}
