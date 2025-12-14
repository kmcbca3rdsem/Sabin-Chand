import java.util.Scanner;

public class FirstNPrime {
    static class PrimeNums{
        int n;
        void printPrime(){
            int a=2,i,c=0,count=0;
            while(count<n){
                for (i=1;i<=a;i++){
                    if(a%i==0){
                        c++;
                    }
                }
                if(c==2){
                    System.out.println(a);
                    count++;
                }
                c=0;
                a++;
            }
        }
    }

    void main(){
        Scanner sc = new Scanner(System.in);
        PrimeNums pm= new PrimeNums();
        int n= sc.nextInt();
        pm.n=n;
        pm.printPrime();
    }
}
