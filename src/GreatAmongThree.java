import java.util.Scanner;

public class GreatAmongThree {
    int a,b,c,mx;
    void main(){
        Scanner sc = new Scanner(System.in);
        GreatAmongThree Max=new GreatAmongThree();
        Max.a=sc.nextInt();
        Max.b=sc.nextInt();
        Max.c=sc.nextInt();

        if(Max.a> Max.b&&Max.a> Max.c){
            Max.mx=Max.a;
        } else if (Max.b> Max.a&&Max.b> Max.c) {
            Max.mx=Max.b;
        }
        else {
            Max.mx= Max.c;
        }

        System.out.println("Maximum number is: "+Max.mx);
    }
}
