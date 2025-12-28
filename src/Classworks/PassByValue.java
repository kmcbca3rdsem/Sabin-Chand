package Classworks;

public class PassByValue {
    static void main() {
        int a = 1000;
        System.out.println(a);
        int b ;
        b = a;
        System.out.println(b);
        b = 2000;
        System.out.println(b);
        System.out.println(a);
    }
}