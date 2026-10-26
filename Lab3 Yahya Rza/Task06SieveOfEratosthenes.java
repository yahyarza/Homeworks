import java.util.Arrays;
import java.util.Scanner;

public class Task06SieveOfEratosthenes {
    public static boolean[] sieve(int limit){boolean[] prime=new boolean[limit+1];Arrays.fill(prime,true);if(limit>=0)prime[0]=false;if(limit>=1)prime[1]=false;
        for(int p=2;p*p<=limit;p++)if(prime[p])for(int m=p*p;m<=limit;m+=p)prime[m]=false;return prime;}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Find primes up to: ");int n=in.nextInt();if(n<2){System.out.println("No primes in that range.");return;}boolean[] p=sieve(n);for(int i=2;i<=n;i++)if(p[i])System.out.print(i+" ");System.out.println();}
}
