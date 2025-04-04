import java.util.Scanner;

public class NeonCheck {

    // Method to check whether a number is neon or not
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;

        // Calculate sum of digits of the square
        while (square > 0) {
            int r = square % 10;
            sum += r;
            square = square / 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Neon number: ");
        int n = scanner.nextInt();

        if (isNeon(n)) {
            System.out.println("✅ " + n + " is a Neon number.");
        } else {
            System.out.println("❌ " + n + " is not a Neon number.");
        }
    }
}
