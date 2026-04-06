package Lab4;
import java.util.Scanner;
import java.util.HashSet;

public class HashSetDemo {
    HashSet<String> elements = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSetDemo hs= new HashSetDemo();
        int i;
        System.out.println("Enter five elements");
        for(i=0;i<5;i++){
            hs.elements.add(sc.next());
        }
        System.out.println("Displaying the five elements");

        System.out.println(hs.elements);

    }
}
