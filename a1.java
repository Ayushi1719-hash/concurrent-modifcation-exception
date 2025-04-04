import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // Creates a reader instance which takes input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // Display user input
        System.out.println("You entered: " + number);

        // New addition: square the input and print it
        int square = number * number;
        System.out.println("Square of the number is: " + square);

        // New addition: say hello
        System.out.println("Hello from Java!");
    }
}
