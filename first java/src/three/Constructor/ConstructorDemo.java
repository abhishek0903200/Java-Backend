package three.Constructor;

import three.classdemo.car;

public class ConstructorDemo {
    public static void main(String[] args) {
        car car1 = new car("Toyota","Red",100);
//        car1.speed = 100;
//        car1.brand = "Toyota";
//        car1.color = "Red";
        car1.drive();

        car car2 = new car("kia","white",-200);
//        car2.speed = 100;
//        car2.brand = "Toyota";
//        car2.color = "Red";
        car2.drive();
        System.out.println(car2.getSpeed());
        car2.setSpeed(500);
        System.out.println(car2.getSpeed());

    }
}
