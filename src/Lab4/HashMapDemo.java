package Lab4;
import java.util.Scanner;
import java.util.HashMap;

public class HashMapDemo {
    HashMap<Integer,String> elements = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMapDemo ld= new HashMapDemo();
        int i;
        System.out.println("Enter five elements");
        for(i=0;i<5;i++){
            ld.elements.put(i,sc.next());
        }
        System.out.println("Displaying the five elements");
        System.out.println(ld.elements);
    }
}
