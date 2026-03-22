package three.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        ElecrtricCar e1 = new ElecrtricCar();
        e1.applyBrakes();
        e1.turnRight();

        Carcontrols mycar1 = new ElecrtricCar();
        mycar1.applyBrakes();
    }
}
