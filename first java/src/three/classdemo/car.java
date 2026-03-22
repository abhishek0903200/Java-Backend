package three.classdemo;

public class car {
    String brand;
    String color;
    int speed;

    public car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public int getSpeed() {
        if(speed < 0)
            return 0;
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //    public car(String brand,String color, int speed) {
//        System.out.println("constructor called");
//        this.brand = brand;
//        this.color = color;
//        this.speed = speed;
//    }

//    public car(String b,String c, int d) {
//        System.out.println("constructor called");
//        brand = b;
//        color = c;
//        speed = d;
//    }

    public void drive(){
        System.out.println(brand + " is driving at "+ speed);
    }
}
