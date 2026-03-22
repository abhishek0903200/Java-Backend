package four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("abhishek");
        users.add("bob");
        users.add("charlie");

        // for each (enhanced for loop)
        for(String user : users){
            System.out.println(user);
        }

        // for LOOP
        for(int i=0;i<users.size();i++){
            System.out.println(users.get(i));
        }

        // Iterator
        Iterator<String> it = users.iterator();
        while(!it.hasNext()){
            System.out.println(it.next());
            if(it.next().equals("bob")){
                it.remove();
            }
        }

        for(String user : users){
            System.out.println(user);
        }

    }
}
