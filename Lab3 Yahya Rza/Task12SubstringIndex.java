import java.util.Scanner;
public class Task12SubstringIndex {
    public static int indexOf(String text,String sub){if(sub.length()==0)return 0;for(int i=0;i<=text.length()-sub.length();i++){int j=0;while(j<sub.length()&&text.charAt(i+j)==sub.charAt(j))j++;if(j==sub.length())return i;}return -1;}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Text: ");String text=in.nextLine();System.out.print("Substring: ");System.out.println(indexOf(text,in.nextLine()));}
}
