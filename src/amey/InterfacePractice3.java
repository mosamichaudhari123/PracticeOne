package amey;

interface Printable2 {
	void print();
}

interface Showable2 extends Printable2 {
	void show();
	//public abstract void print(); ---> inherited method
}

public class InterfacePractice3 implements Showable2 {
	public void print() {
		System.out.println("I am print method in interface");
	}

	public void show() {
		System.out.println("I am show method in interface");
	}

public static void main(String[] args) {
	 	InterfacePractice3 obj = new  InterfacePractice3();
		obj.print();
		obj.show();
		Printable2 obj2 = new  InterfacePractice3();
		obj2.print();
	}
}