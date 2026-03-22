package four;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> roles = new HashSet<>();

        roles.add("ADMIN");
        roles.add("Manager");
        roles.add("user");

        for(String role : roles){
            System.out.println("roles "+ role);
        }
    }
}
