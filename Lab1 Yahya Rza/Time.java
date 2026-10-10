import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();

        if (totalSeconds < 0) {
            System.out.println("Please enter a non-negative number of seconds.");
            input.close();
            return;
        }

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println(hours + " hour(s), " + minutes + " minute(s), "
                + seconds + " second(s)");

        input.close();
    }
}
