import java.util.Random;
import java.util.Scanner;

public class Task05Craps {
    private static final Random RANDOM=new Random();
    private static int roll(){return RANDOM.nextInt(6)+1+RANDOM.nextInt(6)+1;}
    public static boolean playRound() {
        int first=roll(); System.out.println("Come-out roll: "+first);
        if(first==7||first==11)return true;
        if(first==2||first==3||first==12)return false;
        int point=first;
        while(true){int next=roll();System.out.println("Roll: "+next);if(next==point)return true;if(next==7)return false;}
    }
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Number of rounds: ");int n=in.nextInt();int wins=0;
        for(int i=1;i<=n;i++){System.out.println("Round "+i);boolean won=playRound();if(won)wins++;System.out.println(won?"Win":"Lose");}
        System.out.println("Wins: "+wins+", losses: "+(n-wins));}
}
