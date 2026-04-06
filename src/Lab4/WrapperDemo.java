package Lab4;

public class WrapperDemo {
    public static void main(String[] args){
        int num = 5;
        //Int to Integer
        Integer obj = Integer.valueOf(num);
        System.out.println("Primitive int value: "+ num);
        System.out.println("Integer obj value: "+ obj);

        //Integer to obj
        int num2 = obj.intValue();
        System.out.println("Primitive value of num2: "+num2);
    }
}

