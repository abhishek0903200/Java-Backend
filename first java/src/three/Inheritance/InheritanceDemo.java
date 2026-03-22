package three.Inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
        Car c1 = new Car("Kia",200,"four");
        c1.displayInfo();

        Bike b1 = new Bike("yamaha",200,true);
        b1.displayInfo();
    }
}
