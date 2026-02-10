package Polymorphism;

class A{
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
}

class B extends A{
    @Override
    int add(int a,int b){
        return super.add(a,b);
    }

    int subtract(int a,int b){
        return super.subtract(a,b);
    }
}
public class MathematicalOperations {
    static void main(){
        A sub = new B();
        System.out.println(sub.add(5,7));
        System.out.println(sub.subtract(5,7));
    }
}
