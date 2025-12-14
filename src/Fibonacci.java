import java.util.Scanner;

public class Fibonacci {
    int n;
    void main(){
        int a=1,b=1,c=0,i=2;
        Scanner sc = new Scanner(System.in);
        Fibonacci fb = new Fibonacci();
        fb.n= sc.nextInt();
        System.out.println("\nSeries:\n1\n1");
        while(i!=fb.n){
            c=a+b;
            b=a;
            a=c;
            System.out.println(a);
            i++;
        }
    }
}
