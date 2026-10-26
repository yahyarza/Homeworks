class ClassAForMethods { public void methodOne(int i){} public void methodTwo(int i){} public static void methodThree(int i){} public static void methodFour(int i){} }
class ClassBForMethods extends ClassAForMethods { // public static void methodOne(int i) {} // invalid: cannot hide an instance method with static
    @Override public void methodTwo(int i){} // overrides
    // public void methodThree(int i) {} // invalid: cannot override a static method with an instance method
    public static void methodFour(int i){} // hides static method
}
public class Task06OverrideAndHide { public static void main(String[] args){System.out.println("methodTwo overrides methodTwo; methodFour hides methodFour. methodOne and methodThree declarations are invalid in ClassB.");} }
