package Lab2;
import java.util.Scanner;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void greet(){
        System.out.println("Greetings! "+this.name+". Your age is "+this.age);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and age: ");
        Person person = new Person(sc.next(),sc.nextInt());
        person.greet();
    }
}
