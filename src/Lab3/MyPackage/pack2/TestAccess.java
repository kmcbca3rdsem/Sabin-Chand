package Lab3.MyPackage.pack2;
import Lab3.MyPackage.pack1.AccessDemo;

public class TestAccess extends AccessDemo {
    public static void main(String[] args) {
        TestAccess obj = new TestAccess();

        System.out.println("Public: " + obj.a);      // allowed
        System.out.println("Protected: " + obj.b);  // allowed (via inheritance)

        // System.out.println(obj.c);  // ❌ NOT allowed (default)
    }
}
