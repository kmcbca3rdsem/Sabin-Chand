package Lab2;

import static java.lang.Math.pow;
import java.util.Scanner;
public class Circle {
    float radius;
    Circle(float r){
        this.radius=r;
    }
    void Calc(){
        double area = (3.1415)*pow(this.radius,2);
        double circumference = 2*(3.1415)*this.radius;
        System.out.println("Area: "+area);
        System.out.println("Circumference: "+circumference);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        Circle circle = new Circle(sc.nextFloat());
        circle.Calc();
    }
}
