import java.util.Scanner;

public class SumOfOddNumInArray {
    int n;
    void main(String[] args){
        int i,sum=0;
        SumOfOddNumInArray summ = new SumOfOddNumInArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbered to enter:");
        summ.n= sc.nextInt();
        int[] arr= new int[summ.n];
        System.out.println("Enter the Numbers:");
        for(i=0;i<summ.n;i++){
            arr[i]= sc.nextInt();
            if(arr[i]%2!=0){
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum:"+sum);
    }
    }
