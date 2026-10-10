import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = input.nextInt();

        System.out.print("Enter the second integer: ");
        int second = input.nextInt();

        int start = Math.min(first, second);
        int end = Math.max(first, second);
        long sum = 0;

        // Check every number in the range, including both endpoints.
        for (int number = start; number <= end; number++) {
            if (number % 2 != 0) {
                sum += number;
            }
        }

        System.out.println("Sum of odd numbers: " + sum);
        input.close();
    }
}
