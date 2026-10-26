class InitA { static {System.out.println("In static init block of A");} {System.out.println("In instance init block of A");} InitA(){System.out.println("In constructor A.");} }
class InitB extends InitA { static {System.out.println("In static init block of B");} {System.out.println("In instance init block of B");} InitB(){System.out.println("In constructor B.");} }
public class Task02InitializationOrder { public static void main(String[] args){new InitB();} }
// Static blocks run superclass first, then subclass. Instance initialization and constructors also run superclass first.
