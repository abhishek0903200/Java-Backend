package four;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1,"Abhishek");
        userMap.put(2,"Bob");
        userMap.put(3,"Charlie");

        System.out.println("user with id 2 "+ userMap.get(2));

        System.out.println("all user");
        for (Map.Entry<Integer,String> entry : userMap.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
    }
}
