package amey;
class fruit {
	fruit() {
		System.out.println("Fruit Constructor Called:");
	}
	public void eat() {
		System.out.println("Fruits are eatable:");
	}
}

class papaya extends fruit {
	//compiler writes by default super statement
	papaya() {
		System.out.println("Papaya Constructor Called:");
	}
	public void sweet() {
		System.out.println("Friuts are sweet:");
	}
}
public class InheritPractice3 {

	public static void main(String[] args) {
		papaya in = new papaya();//object of child class
		in.eat();
		in.sweet();
	}

}
/* here we are created instance of child class--->papaya in = new papaya();
 * where we did not write super statement,compiler writes by default super statement
 */
