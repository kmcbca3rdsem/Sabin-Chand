package Lab4;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    ArrayList<String> name = new ArrayList<>();
    public static void main(String[] agrs){
        ArrayListDemo arrDemo = new ArrayListDemo();
        System.out.println("Enter five student's name: ");
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++){
            arrDemo.name.add(sc.next());
        }
        System.out.println("Displaying the list:");
        for(i=0;i<5;i++){
            System.out.println(arrDemo.name.get(i));
        }
    }
}
