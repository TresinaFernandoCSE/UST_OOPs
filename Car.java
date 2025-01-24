
// Program 4: Class and Object Example
class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void accelerate(int increment) {
        speed += increment;
    }

    void displaySpeed() {
        System.out.println(brand + " is running at " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 80);
        myCar.accelerate(20);
        myCar.displaySpeed();
    }
}
