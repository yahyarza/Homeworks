import java.util.Arrays;

public class Task01CommandLineArguments {
    public static void printArguments(String[] args) {
        for (String arg : args) System.out.println(arg);
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) total += number;
        return total;
    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        printArguments(args);
        int[] numbers = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) numbers[i] = Integer.parseInt(args[i]);
            if (numbers.length > 0) {
                printArray(numbers);
                System.out.println("Sum: " + sum(numbers));
                System.out.println("Average: " + (double) sum(numbers) / numbers.length);
            }
        } catch (NumberFormatException e) {
            System.out.println("Pass only integers to calculate the sum and average.");
        }
    }
}
