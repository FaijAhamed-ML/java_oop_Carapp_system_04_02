class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
class Engine {
    String engineType;

    Engine(String engineType) {
        this.engineType = engineType;
    }

    void displayEngineDetails() {
        System.out.println("Engine Type: " + engineType);
    }
}
class Car extends Vehicle {
    String model;
    Engine engine;

    Car(String brand, int speed, String model, String engineType) {
        super(brand, speed);              // initialize Vehicle attributes
        this.model = model;
        this.engine = new Engine(engineType);  // composition: Car HAS Engine
    }

    void displayCarDetails() {
        System.out.println("---- Car Details ----");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Model: " + model);
        engine.displayEngineDetails();   // display engine inside car details
    }
}
public class _04_02_CarApp {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, "Corolla", "VVT-i");

        car.displayCarDetails(); 
}
}
