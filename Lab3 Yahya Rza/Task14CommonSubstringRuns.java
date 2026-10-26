import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task14CommonSubstringRuns {
    public static List<String> commonRuns(String a,String b){List<String> found=new ArrayList<>();int i=0;while(i<Math.min(a.length(),b.length())){if(a.charAt(i)==b.charAt(i)){int start=i;while(i<Math.min(a.length(),b.length())&&a.charAt(i)==b.charAt(i))i++;found.add(a.substring(start,i));}else i++;}return found;}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("First string: ");String a=in.nextLine();System.out.print("Second string: ");String b=in.nextLine();List<String> runs=commonRuns(a,b);for(String s:runs)System.out.println(s);System.out.println("Count: "+runs.size());}
}
