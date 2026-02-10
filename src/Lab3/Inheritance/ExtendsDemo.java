package Lab3.Inheritance;

// Superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

// Subclass
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Main class
public class ExtendsDemo {
    public static void main(String[] args) {
        Car c = new Car();

        c.start(); // inherited
        c.drive(); // own
    }
}
