package Lab3.Inheritance.MultipleInheritance;

// Interface
interface PrintableB {
    void print();
}

// Class
class Report implements PrintableB {
    public void print() {
        System.out.println("Printing report.");
    }
}

// Main class
public class InterfaceReferenceDemo {
    public static void main(String[] args) {
        PrintableB p; // interface reference
        p = new Report(); // implementing object

        p.print();
    }
}
