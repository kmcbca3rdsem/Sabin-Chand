package Lab3.exceptionhandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBounds
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is invalid");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
