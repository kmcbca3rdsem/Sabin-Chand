package Lab4;
import java.util.Stack;
import java.util.Scanner;

public class StackDemo {
    Stack<String> elements = new Stack<>();
    public static void main(String[] args){
        StackDemo sd = new StackDemo();
        Scanner sc =new Scanner(System.in);
        int n=1;
        while(true){
            System.out.println("1. push\n2.pop");
            n=sc.nextInt();
            if(n==1){
                System.out.println("Enter element to push");
                sd.elements.push(sc.next());
            }
            else if (n==2){
                System.out.println("Popped element: "+ sd.elements.pop());
            }
            else{
                break;
            }
        }
        System.out.println("Displaying Elements: "+sd.elements);
    }
}
