package Lab3.Inheritance.MultipleInheritance;

// Interface 1
interface A {
    void showA();
}

// Interface 2
interface B {
    void showB();
}

// Implementing both interfaces
class Test implements A, B {
    public void showA() {
        System.out.println("Method of interface A");
    }

    public void showB() {
        System.out.println("Method of interface B");
    }
}

// Main class
public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        Test t = new Test();
        t.showA();
        t.showB();
    }
}
