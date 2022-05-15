package amey;
class Fruit1 {
	int FruitValue;
	Fruit1() {
		System.out.println("Fruit Constructor Called:");
	}
	public void taste() {
		System.out.println("taste() Called:");
	}
}
class Mango extends Fruit1 {
	int FruitValue;
	Mango() {
		//by default compiler writes super statement
		System.out.println("Mango constructor called:");
		FruitValue = 10;
	}
	public void taste() {
		System.out.println("Mango_taste() called:");
	}
	public void eat() {
		System.out.println("Mango_eat() called:");
		System.out.println("Mango_fruitValue :"+FruitValue);
		System.out.println("Fruit_FruitValue :"+super.FruitValue);
		taste();
		//super.taste();
	
	}
}
public class InheritPractice7 {

	public static void main(String[] args) {
		Mango m1 = new Mango();
		m1.eat();
		m1.taste();
	}

}
