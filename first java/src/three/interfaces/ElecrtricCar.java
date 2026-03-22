package three.interfaces;

public class ElecrtricCar implements Carcontrols{
    @Override
    public void turnLeft() {
        System.out.println("Elec left");
    }

    @Override
    public void turnRight() {
        System.out.println("Elec right");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Elec brakes");

    }
}
