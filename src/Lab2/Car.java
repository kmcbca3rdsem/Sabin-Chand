package Lab2;

public class Car {
    String brand;
    String model;
    String year;

    Car(String brand, String model, String year){
        this.brand  = brand;
        this.model = model;
        this.year = year;
    }

    void printCarDetails(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("Year: "+this.year);
    }

    static void main(){
        Car car = new Car("Nissan","GT r35","2025");
        car.printCarDetails();
    }
}
