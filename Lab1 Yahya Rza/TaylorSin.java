import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x in radians: ");
        double x = input.nextDouble();

        System.out.print("Enter the number of Taylor terms (positive integer): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number of terms must be positive.");
            input.close();
            return;
        }

        // sin(x) = x - x^3/3! + x^5/5! - ...
        double term = x;
        double sum = term;

        for (int i = 1; i < n; i++) {
            term *= -(x * x) / ((2.0 * i) * (2.0 * i + 1));
            sum += term;
        }

        System.out.println("Taylor approximation: " + sum);
        System.out.println("Math.sin(x): " + Math.sin(x));

        input.close();
    }
}
