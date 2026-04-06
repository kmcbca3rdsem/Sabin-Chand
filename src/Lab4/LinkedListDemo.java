package Lab4;
import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListDemo {
    LinkedList<String> elements = new LinkedList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedListDemo ld= new LinkedListDemo();
        int i;
        System.out.println("Enter five elements");
        for(i=0;i<5;i++){
            ld.elements.add(sc.next());
        }
        System.out.println("Displaying the five elements");
            System.out.println(ld.elements);
    }
}
