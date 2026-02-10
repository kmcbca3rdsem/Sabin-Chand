package Lab3.exceptionhandling;

public class ThrowDemo {
    public static void main(String[] args) {
        int age = 14;

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("You can vote.");
    }
}
