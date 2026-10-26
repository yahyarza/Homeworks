import java.util.Scanner;
public class Task13WordSlices {
    public static void printSlices(String word){for(int i=1;i<word.length();i++)System.out.println(word.substring(0,i)+" "+word.substring(i));}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Word: ");printSlices(in.nextLine());}
}
