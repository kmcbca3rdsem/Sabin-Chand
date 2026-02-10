package Lab3.Inheritance;

// Parent class
class Animala {
    void eat() {
        System.out.println("The animal eats food.");
    }
}

// Child class
class Doga extends Animala {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class SingleLevel {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat(); // inherited method
        d.bark(); // own method
    }
}
