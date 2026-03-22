package three.polymorphism;

public class Car extends Vehicle {
    public int door;

    public Car(String brand, int speed, int door) {
        super(brand, speed);
        this.door = door;
    }

    @Override
    public  void start(){
        System.out.println("starting Car");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand "+ getBrand()+ " Speed "+ getSpeed()+"km/hrs " + door+" doors");
    }
}
