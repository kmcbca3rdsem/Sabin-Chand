package Lab2;
import java.util.Scanner;

public class Rectangle {
    int length;
    int width;

    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    void areaPerimeter(){
        int area;
        int perimeter;
        area=this.length*this.width;
        perimeter=2*(this.length+this.width);
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and Width: ");
        Rectangle rc = new Rectangle(sc.nextInt(), sc.nextInt());
        rc.areaPerimeter();
    }
}
