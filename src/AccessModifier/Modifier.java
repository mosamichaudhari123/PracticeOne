package AccessModifier;

public class Modifier {
	private int age1 = 27;
	int age2 = 28;
	protected int age3 = 29;
	public int age4 = 30;

	public static void main(String[] args) {

		Modifier m1 = new Modifier();
		System.out.println("Private int age :" + m1.age1);
		System.out.println("Default int age :" + m1.age2);
		System.out.println("Protected int age :" + m1.age3);
		System.out.println("Public int age :" + m1.age4);
	}

}

class AccessModifiers {
	public static void main(String[] args) {

		Modifier m1 = new Modifier();
		//System.out.println("Private int age :" + m1.age1); //private cannot accessible another class
		System.out.println("Default int age :" + m1.age2);
		System.out.println("Protected int age :" + m1.age3);
		System.out.println("Public int age :" + m1.age4);
	}
}