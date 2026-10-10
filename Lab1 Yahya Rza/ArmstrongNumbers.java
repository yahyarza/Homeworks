import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println(number + " is not an Armstrong number.");
            input.close();
            return;
        }

        int digits = 0;
        int temporary = number;

        // The do-while loop also counts 0 as a one-digit number.
        do {
            digits++;
            temporary /= 10;
        } while (temporary != 0);

        temporary = number;
        long sum = 0;

        do {
            int digit = temporary % 10;
            long digitPower = 1;

            for (int i = 0; i < digits; i++) {
                digitPower *= digit;
            }

            sum += digitPower;
            temporary /= 10;
        } while (temporary != 0);

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        input.close();
    }
}
