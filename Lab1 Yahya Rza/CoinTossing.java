import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many times should the coin be tossed? ");
        int tosses = input.nextInt();

        if (tosses <= 0) {
            System.out.println("Please enter a positive number of tosses.");
            input.close();
            return;
        }

        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= tosses; i++) {
            if (Math.random() < 0.5) {
                heads++;
                System.out.println("Toss " + i + ": Heads");
            } else {
                tails++;
                System.out.println("Toss " + i + ": Tails");
            }
        }

        double headsProbability = (double) heads / tosses;
        double tailsProbability = (double) tails / tosses;

        System.out.println("Heads: " + heads + " (" + (headsProbability * 100) + "%)");
        System.out.println("Tails: " + tails + " (" + (tailsProbability * 100) + "%)");

        input.close();
    }
}
