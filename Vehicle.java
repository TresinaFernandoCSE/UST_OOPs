
// Program 9: Abstract Class with Constructor
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();
}

class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    void start() {
        System.out.println(brand + " bike is starting");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v = new Bike("Yamaha");
        v.start();
    }
}
