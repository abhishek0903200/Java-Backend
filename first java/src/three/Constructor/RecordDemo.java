package three.Constructor;

record Bike(String brand, int speed){}

public class RecordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("BMW", 200);
        System.out.println(bike.brand());
        System.out.println(bike.speed());

        System.out.println(bike);
    }
}
