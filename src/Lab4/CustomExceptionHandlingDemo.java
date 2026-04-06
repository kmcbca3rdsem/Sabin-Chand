package Lab4;
import java.util.Scanner;

public class CustomExceptionHandlingDemo {
    int age;
    CustomExceptionHandlingDemo(int age){
        this.age=age;
    }

    static void checkAge(int age) throws CustomException{
        if(age<18){
            throw new CustomException("Invalid Age!");
        }else{
            System.out.println("Age valid");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        CustomExceptionHandlingDemo c = new CustomExceptionHandlingDemo(sc.nextInt());
        try{
            checkAge(c.age);
        }catch (CustomException e){
            System.out.println(e);
        }
    }
}
