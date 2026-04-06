package Lab4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KeyboardInputExample {
    public static void main(String[] args) {
        // Create BufferedReader to read from standard input (keyboard)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine(); // read a line of text

            System.out.print("Enter your age: ");
            String ageInput = reader.readLine(); // read a line of text
            int age = Integer.parseInt(ageInput); // convert to integer

            System.out.println("Hello, " + name + "! You are " + age + " years old.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number for age.");
        }
    }
}
