class CalcParent { public int calcValue(int a){System.out.println("Super");return a*2;} }
class CalcChild extends CalcParent { public int calcValue(int a,int b){System.out.println("Subclass");return (a+b)*2;} }
public class Task03Overloading { public static void main(String[] args){CalcChild child=new CalcChild();System.out.println(child.calcValue(5));System.out.println(child.calcValue(5,10));} }
// This is overloading, not overriding: the parameter lists are different.
