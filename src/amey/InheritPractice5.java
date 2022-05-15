package amey;
class Bikes {
	Bikes() {
		System.out.println("Bikes Constructor Called:");
	}
	void Hero_Honda() {
		System.out.println("Hero_Honda Constructor Called:");
	}
}

class Maruti extends Bikes {
	Maruti(double m) {
		super();
		System.out.println("Maruti Constructor Called:");
	}
	void Fourwheeler() {
		System.out.println("Fourwheeler method Called:");
	}
}

class Auto extends Maruti {
	Auto() {
		super(23.5);
		System.out.println("Auto Constructor called:");
	}
	public void ThreeWheeler() {
		System.out.println("ThreeWheeler method Called:");
	}
}
public class InheritPractice5 {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		a1.Fourwheeler();
		a1.Hero_Honda();
		a1.ThreeWheeler();
		System.out.println("**************************************");
		Maruti m1 = a1;
		m1.Fourwheeler();
		m1.Hero_Honda();
		System.out.println("***************************************");
		Bikes b1 = m1;
		b1.Hero_Honda();
		System.out.println("*****************************************");
		Bikes b2 = new Maruti(24.4);
		b2.Hero_Honda();
	}

}

/* Here we are using Super Statement
 * we are creating instance of Maruti class-->Bikes b2 = new Maruti(24.4);
 * SUPER STATEMENT:-
 * Super Statement is an instance of parent class.
 * When instance of child class created and using with parameterized constructor 
 * super statement should be first statement in the child class.
 * 
 * CONSTRUCTOR CHAINING:-
 * when child class call to parents class and parent class calls to its parents class
 * is known as constructor chaining
 */
