package Lab3.Inheritance.MultipleInheritance;

// Interface
interface Printable {
    void print();
}

// Implementing class
class Document implements Printable {
    public void print() {
        System.out.println("Printing document.");
    }
}

// Main class
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
    }
}
