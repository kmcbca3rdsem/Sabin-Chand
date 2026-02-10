package Lab3;

// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Child class
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Main class
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
    }
}

