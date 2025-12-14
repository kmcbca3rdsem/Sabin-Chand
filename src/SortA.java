import java.util.Scanner;

public class SortA {
    int n;
    void main(){
        int i,j;
        SortA sort = new SortA();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbered to enter:");
        sort.n= sc.nextInt();
        int[] arr= new int[sort.n];
        System.out.println("Enter the Numbers:");
        for(i=0;i<sort.n;i++){
            arr[i]= sc.nextInt();
        }

        int temp;
        for(i=0;i<sort.n;i++){
            for(j=i;j<sort.n;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\n\nSorted in Ascending Order:");
        for(i=0;i< sort.n;i++){
            System.out.println(arr[i]);
        }
    }
}
