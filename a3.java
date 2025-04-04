import java.io.*;

class GFG {

    // Method to check whether number is neon or not
    public static boolean isNeonNumber(int n) {
        int square = n * n;
        int sum = 0;

        System.out.println("Calculating Neon status for number: " + n);
        System.out.println("Square of the number: " + square);

        while (square > 0) {
            int r = square % 10;
            sum += r;
            square = square / 10;
        }

        System.out.println("Sum of digits of the square: " + sum);
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 9;

        if (isNeonNumber(n)) {
            System.out.println(n + " is a Neon number ✔️");
        } else {
            System.out.println(n + " is not a Neon number ❌");
        }
    }
}
