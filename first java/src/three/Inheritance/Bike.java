package three.Inheritance;

public class Bike extends Vehicle{

    public boolean hasCarrier;

    public Bike(String brand, int speed , boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand "+ getBrand()+ " Speed "+ getSpeed()+"km/hrs " + hasCarrier+" hasCarrier");
    }
}
