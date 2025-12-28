package Classworks;

class Car {
    // default access modifiers
    String name;      // variable declaration
    float mileage;
    int price;
}

public class PassByReference {

    public static void main(String[] args) {
        Car c = new Car();   // object initialization

        c.name = "BMW";
        c.mileage = 200.0f;
        c.price = 300;

        System.out.println(c.name);
        System.out.println(c.mileage);
        System.out.println(c.price);

        Car b = new Car();
        b=c;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.price);

        b.name="TATA";
        b.mileage=50.0f;
        b.price=100;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.price);
    }
}
