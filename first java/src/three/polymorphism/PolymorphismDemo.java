package three.polymorphism;

class Calculator{
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {
        Car c1 = new Car("Kia",200,4);
        c1.displayInfo();

        Bike b1 = new Bike("yamaha",200,true);
        b1.displayInfo();

        c1.start();
        b1.start();

        Vehicle v1 = new Vehicle("BMW",108);
        v1.start();

        // example of method overriding --> runtime polymorphism( same method name but diff implementation in child class)
        Vehicle v2 = new Car("Mahindra",108,6);
        v2.start();

        Vehicle v3 = new Bike("yamaha",200,true);
        v3.start();


        // Method overloading --> compile time polymorphism( same method name but diff parameters)
        b1.start(" hello");

        Calculator calculator = new Calculator();
        System.out.println("Sum(int)"+ calculator.add(2,3));
        System.out.println("Sum(int)"+ calculator.add(5.6,3.1));
    }
}
