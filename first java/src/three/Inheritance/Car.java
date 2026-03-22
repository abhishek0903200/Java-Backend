package three.Inheritance;

public class Car extends Vehicle{
    public String door;

    public Car(String brand, int speed, String door) {
        super(brand, speed);
        this.door = door;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand "+ getBrand()+ " Speed "+ getSpeed()+"km/hrs " + door+" doors");
    }
}
