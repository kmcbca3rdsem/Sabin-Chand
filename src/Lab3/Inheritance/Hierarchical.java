package Lab3.Inheritance;

// Parent class is colliding with other animal class in same package
class Animal {
    void eat() {
        System.out.println("The animal eats food.");
    }
}

// Child class 1 is also colliding
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class Hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat(); // inherited
        d.bark();

        c.eat(); // inherited
        c.meow();
    }
}
