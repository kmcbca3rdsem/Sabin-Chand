package Lab3;

// Parent class
class Animal {
    Animal() {
        System.out.println("Animal constructor called.");
    }

    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Child class
class Dog extends Animal {
    Dog() {
        super();  // calling parent constructor
        System.out.println("Dog constructor called.");
    }

    void show() {
        super.eat();  // calling parent method
        System.out.println("Dog barks.");
    }
}

// Main class
public class SuperDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}

