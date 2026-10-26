import java.util.Arrays;
import java.util.Scanner;
public class Task10Anagrams {
    public static boolean areAnagrams(String a,String b){char[] x=a.replaceAll("\\s+","").toLowerCase().toCharArray();char[] y=b.replaceAll("\\s+","").toLowerCase().toCharArray();Arrays.sort(x);Arrays.sort(y);return Arrays.equals(x,y);}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("First word: ");String a=in.nextLine();System.out.print("Second word: ");String b=in.nextLine();System.out.println(areAnagrams(a,b));}
}
