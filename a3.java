import java.util.Scanner;

public class FibonacciEvenSumCalculator {

    // Computes Fibonacci series and sums the even-indexed values
    static int computeEvenIndexSum(int N) {
        if (N <= 0)
            return 0;

        int[] fib = new int[2 * N + 1];
        fib[0] = 0;
        fib[1] = 1;

        int sum = 0;

        System.out.print("🔢 Fibonacci Series: " + fib[0] + ", " + fib[1]);
        for (int j = 2; j <= 2 * N; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];
            System.out.print(", " + fib[j]);

            if (j % 2 == 0) {
                sum += fib[j];
            }
        }
        System.out.println(); // Line break
        return sum;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = scanner.nextInt();

        int result = computeEvenIndexSum(N);
        System.out.println("✅ Sum of even-indexed Fibonacci numbers till 2N = " + (2 * N) + " is: " + result);
    }
}
