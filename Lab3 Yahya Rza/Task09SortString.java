import java.util.Arrays;
import java.util.Scanner;
public class Task09SortString {
    public static String sort(String text){char[] chars=text.toCharArray();Arrays.sort(chars);return new String(chars);}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Text: ");System.out.println(sort(in.nextLine()));}
}
