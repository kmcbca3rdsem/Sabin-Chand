package Lab4;
import java.math.*;
import java.util.Scanner;

public class MathClassDemo {
    int num;
    public static void main(String[] args){
        MathClassDemo mat = new MathClassDemo();
        Scanner sc = new Scanner(System.in);
        mat.num = sc.nextInt();
        System.out.println("Entered Num: "+ mat.num);
        System.out.println("Squared: "+ Math.pow(mat.num,2));
        System.out.println("Square Root: "+Math.sqrt(mat.num));
        System.out.println("random"+Math.random());
    }
}
