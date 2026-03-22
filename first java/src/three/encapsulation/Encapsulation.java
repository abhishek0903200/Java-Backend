package three.encapsulation;

class car {
    private String brand;
    private String color;
    private int speed;

    public car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
    //    this.speed = speed;
        setSpeed(speed);
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0)
            speed = 0;
        this.speed = speed;
    }

    public void drive(){
        System.out.println(brand + " is driving at "+ speed);
    }
}


public class Encapsulation {
    public static void main(String[] args) {

        car car1 = new car("Toyota","Red",100);
        car1.setSpeed(-100);
        //car1.brand = "Honda";
        car1.drive();

        car car2 = new car("kia","white",-200);
        car2.drive();
    }

}

