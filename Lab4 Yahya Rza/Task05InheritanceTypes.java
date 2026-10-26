class AnimalSingle { void eat(){System.out.println("Eating");} }
class DogSingle extends AnimalSingle { void bark(){System.out.println("Barking");} }
class LivingThingMulti { }
class MammalMulti extends LivingThingMulti { }
class HumanMulti extends MammalMulti { }
class ShapeHier { }
class CircleHier extends ShapeHier { }
class RectangleHier extends ShapeHier { }
interface CanFly { void fly(); }
interface CanSwim { void swim(); }
class DuckHybrid extends AnimalSingle implements CanFly,CanSwim { public void fly(){} public void swim(){} }
public class Task05InheritanceTypes { public static void main(String[] args){System.out.println("Single: DogSingle extends AnimalSingle");System.out.println("Multilevel: LivingThingMulti -> MammalMulti -> HumanMulti");System.out.println("Hierarchical: CircleHier and RectangleHier extend ShapeHier");System.out.println("Multiple: Java classes cannot extend two classes; a class can implement multiple interfaces");System.out.println("Hybrid: DuckHybrid extends a class and implements two interfaces");} }
