import java.util.Scanner;
public class Task08ExplodedString {
    public static String explode(String text){StringBuilder result=new StringBuilder();for(int i=1;i<=text.length();i++)result.append(text,0,i);return result.toString();}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Word: ");System.out.println(explode(in.nextLine()));}
}
