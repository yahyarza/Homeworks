class SuperInitA { static {System.out.println("AS");} {System.out.println("A");} SuperInitA(){System.out.println("AC");} SuperInitA(int x){System.out.println(x+" AC");} }
class GeneralTypeForTask extends SuperInitA { static {System.out.println("GTS");} {System.out.println("GT");} GeneralTypeForTask(){super(5);System.out.println("GTC");} }
public class Task04SuperConstructor { public static void main(String[] args){new GeneralTypeForTask();} }
// Output order: AS, GTS, A, 5 AC, GT, GTC.
