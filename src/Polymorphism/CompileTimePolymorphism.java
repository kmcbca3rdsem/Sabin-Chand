package Polymorphism;

class MethodOverloading {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class CompileTimePolymorphism{
    static void main(){
        MethodOverloading mo = new MethodOverloading();
        int addTwo=mo.add(5,10);
        int addThree=mo.add(5,10,15);
        System.out.println(addTwo);
        System.out.println(addThree);
    }
}
