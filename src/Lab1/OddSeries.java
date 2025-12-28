package Lab1;

import java.util.Scanner;

public class OddSeries {
    int n;
    void main(){
        int c;
        Scanner sc= new Scanner(System.in);
        OddSeries os=new OddSeries();
        os.n=sc.nextInt();
        System.out.println("Series: \n");
        for (c=1;c<=os.n;c=c+2){
            System.out.println(c);
        }
    }
}
