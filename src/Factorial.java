import java.util.Scanner;

public class Factorial {
    int n;
    void main(){
        int i;
        Scanner sc = new Scanner(System.in);
        Factorial ft = new Factorial();
        ft.n=sc.nextInt();
        System.out.println("Factorials:");
        for(i=1;i<=ft.n;i++){
            if(ft.n%i==0){
                System.out.println(i);
            }
        }
    }
}
