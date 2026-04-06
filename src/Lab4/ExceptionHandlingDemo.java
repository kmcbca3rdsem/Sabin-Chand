package Lab4;

public class ExceptionHandlingDemo {
    int a,b,c;
    ExceptionHandlingDemo(int a, int b){
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args){
        ExceptionHandlingDemo ex = new ExceptionHandlingDemo(1,0);
        try{
            ex.c = ex.a/ex.b;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
