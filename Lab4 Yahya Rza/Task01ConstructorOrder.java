class ParentForConstructor { ParentForConstructor(){System.out.println("In constructor X.");} }
class ChildForConstructor extends ParentForConstructor { ChildForConstructor(){System.out.println("In constructor Y.");} }
public class Task01ConstructorOrder { public static void main(String[] args){new ChildForConstructor();} }
// Output: In constructor X. then In constructor Y. The parent constructor runs first.
