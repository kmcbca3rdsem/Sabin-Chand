package Lab4;
import java.util.Scanner;
import java.lang.String;

public class StringClassDemo {
    String string;
    StringClassDemo(String string){
        this.string = string;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a random string!(No Gap)");
        StringClassDemo st = new StringClassDemo(sc.next());
        System.out.println("Entered String: "+ st.string);
        String st2 = new String(st.string);
        System.out.println("Length of the String: "+ st2.length());
        System.out.println("Uppercase: "+st2.toUpperCase());
        System.out.println("Substring (first 3 letters): "+st2.substring(0,3));
    }
}
