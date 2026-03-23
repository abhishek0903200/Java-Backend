package six.inbuilt;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesDemo {
    public static void main(String[] args) {

        // ::
        // 1st
        List<String> names = Arrays.asList("alice","bob","charlie");
        for(int i = 0;i<names.size();i++){
            System.out.println(names.get(i));
        }

        //2nd enhanced for
        for(String name : names)
            System.out.println(name);

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println(name);
//            }
//        });

//        names.forEach((String name) -> System.out.println(name));

        names.forEach(System.out::println);

    }
}
