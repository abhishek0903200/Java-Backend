package four.project;

import java.util.*;

public class UserManagementDemo {
    public static void main(String[] args) {
        // Set<String> user1Roles= new HashSet<>(Arrays.asList("Admin","User"));
        // User user1 = new User("Alice",true,user1Roles);
        List<User> users = new ArrayList<>();

        //users.add(user1);
        users.add(new User("Alice",true,
                new HashSet<>(Arrays.asList("Admin","User"))));

        users.add(new User("Bob",false,
                new HashSet<>(Arrays.asList("User"))));

        users.add(new User("Charlie",true,
                new HashSet<>(Arrays.asList("Manager"))));

        users.add(new User("Alice",true,
                new HashSet<>(Arrays.asList("Admin","User"))));

        // remove
        Iterator<User> iterator = users.iterator();
        while(!iterator.hasNext()){
            if(!iterator.next().isActive()){
                iterator.remove();
            }
        }

        // print active users
        System.out.println("active users ");
        for (User user : users){
            System.out.println(user.getName());
        }

        // count users per role
        Map<String, Integer> roleCount = new HashMap<>();
        for(User user : users){
            for(String role : user.getRoles()){
                roleCount.put(role, roleCount.getOrDefault(role,0)+1);
            }
        }

        for (Map.Entry<String,Integer> entry : roleCount.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
