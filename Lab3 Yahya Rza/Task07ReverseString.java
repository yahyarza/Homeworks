import java.util.Scanner;
public class Task07ReverseString {
    public static String reverse(String text){return new StringBuilder(text).reverse().toString();}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Text: ");System.out.println(reverse(in.nextLine()));}
}
