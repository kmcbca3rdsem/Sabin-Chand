package Lab3;

// Parent class
class ShapeB {
    void draw() {
        System.out.println("Drawing a shape.");
    }
    int w=9;
}

// Child class
class Circle extends ShapeB {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
    int w=0;
}

// Main class
public class DynamicDispatchDemo {
    public static void main(String[] args) {
        ShapeB s;          // parent reference
        s = new Circle(); // child object
        System.out.println(s.w);// calls parent variable
        s.draw();  // calls child's method
    }
}

