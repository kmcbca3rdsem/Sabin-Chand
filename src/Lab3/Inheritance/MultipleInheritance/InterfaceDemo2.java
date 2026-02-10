package Lab3.Inheritance.MultipleInheritance;

// Interface
interface Drawable {
    void draw();
}

// Class 1
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing circle.");
    }
}

// Class 2
class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing square.");
    }
}

// Main class
public class InterfaceDemo2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();

        c.draw();
        s.draw();
    }
}
