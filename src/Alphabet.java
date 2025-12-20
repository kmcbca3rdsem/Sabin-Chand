public class Alphabet {

    public class A{
        void print(){
            System.out.println("A");
        }
    }
    public class B extends A{
        @Override
        void print(){
            System.out.println("B");
        }
    }
    void main(){
        A a=new A();
        B b=new B();
        a.print();
        b.print();
    }
}
