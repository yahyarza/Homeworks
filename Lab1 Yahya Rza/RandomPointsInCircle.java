import java.util.Scanner;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many random points should be generated? ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number of points.");
            input.close();
            return;
        }

        for (int i = 1; i <= count; i++) {
            double x;
            double y;

            // Generate points in the square until the point is inside the unit circle.
            do {
                x = -1 + 2 * Math.random();
                y = -1 + 2 * Math.random();
            } while (x * x + y * y > 1);

            System.out.printf("Point %d: (%.5f, %.5f)%n", i, x, y);
        }

        input.close();
    }
}
