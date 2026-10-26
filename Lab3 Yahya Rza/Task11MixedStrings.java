import java.util.Scanner;
public class Task11MixedStrings {
    public static String mix(String sentence){String[] words=sentence.split(" ",-1);for(int i=0;i<words.length;i++){String w=words[i];if(w.length()>1)words[i]=w.charAt(w.length()-1)+w.substring(1,w.length()-1)+w.charAt(0);}return String.join(" ",words);}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Sentence: ");System.out.println(mix(in.nextLine()));}
}
