package four;

import java.util.List;
import java.util.ArrayList;

class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }
}

public class ListDemo {

    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("abhishek");
        users.add("bob");
        users.add("charlie");

        System.out.println("all users");
        for(String  user : users){
            System.out.println(user);
        }

        // System.out.println("Element "+ users.get(3));

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Ford");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        for(Car car : carList){
            System.out.println(car.brand);
        }

    }
}
