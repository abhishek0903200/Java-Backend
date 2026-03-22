package four;

import java.util.ArrayList;
import java.util.List;

class CarNew {
    String brand;

    public CarNew(String brand) {
        this.brand = brand;
    }
}

public class GenericsDemo {

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

        CarNew car1 = new CarNew("Toyota");
        CarNew car2 = new CarNew("Ford");

        List<CarNew> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        for(CarNew car : carList){
            System.out.println(car.brand);
        }

    }
}

