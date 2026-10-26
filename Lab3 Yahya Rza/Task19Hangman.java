import java.util.Scanner;
public class Task19Hangman {
    public static void main(String[] args){Scanner in=new Scanner(System.in);String word="computer";char[] shown=new char[word.length()];java.util.Arrays.fill(shown,'_');int wrong=0;while(wrong<6&&new String(shown).contains("_")){System.out.println("Word: "+String.valueOf(shown)+" | wrong guesses: "+wrong+"/6");System.out.print("Guess a letter: ");String line=in.nextLine().toLowerCase();if(line.isEmpty())continue;char guess=line.charAt(0);boolean found=false;for(int i=0;i<word.length();i++)if(word.charAt(i)==guess){shown[i]=guess;found=true;}if(!found)wrong++;}System.out.println(new String(shown).equals(word)?"You won!":"You lost. The word was "+word+".");}
}
