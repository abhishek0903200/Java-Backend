package seven;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args) {

        String name = "Java";
        if(name != null )
            System.out.println(name.length());
                    else{
            System.out.println("Null valve");
        };
        System.out.println(name.length());


        //creating optional
        Optional<String> optionalString = Optional.of("Java");
        System.out.println(optionalString);

        Optional<String> emoty = Optional.empty();
        System.out.println(emoty);

        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println(mayBe);

        // checking value
        System.out.println(optionalString.isPresent());
        System.out.println(mayBe.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(mayBe.isEmpty());


        // get()
        System.out.println(optionalString.get());
        // System.out.println(mayBe.get());

        //orElse("default-value")
        System.out.println(optionalString.orElse("default1"));
        System.out.println(mayBe.orElse("default2"));

        String temp = mayBe.orElse("default");

        // orElseGet (<Supplier>) supplier r no input parameter give only output
        String result = mayBe.orElseGet(() -> {
            System.out.println("generating default Value 1");
            return "default";
        });
        System.out.println(result);

        String result1 = optionalString.orElseGet(() -> {
            System.out.println("generating default Value2");
            return "default";
        });
        System.out.println(result1);

        //OrElseThrow()
        String newResult = optionalString.orElseThrow(
                () -> new RuntimeException("not Found")
        );
        System.out.println(newResult);
    }
}
