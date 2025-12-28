package Lab1;

import java.util.Scanner;

public class Operators {
    int a,b;
    Scanner sc = new Scanner(System.in);

    void main(){
        Operators op = new Operators();
        while(true) {
            op.a = sc.nextInt();
            op.b = sc.nextInt();
            System.out.println("Arithemetic Lab1.Operators:\n");
            System.out.println("Addition: "+op.a+"+"+op.b+"="+(op.a+op.b));
            System.out.println("Subtraction: "+op.a+"-"+op.b+"="+(op.a-op.b));
            System.out.println("Multiplication: "+op.a+"*"+op.b+"="+(op.a*op.b));
            System.out.println("Division: "+op.a+"/"+op.b+"="+(op.a/op.b));
        }
    }
}
