package amey;
interface Printable{
	int age = 45;
	void print();
	
}
interface Showable{
	void show();
}

public class InterfacePractice1 implements Printable,Showable {
	public static int age = 78;
	public void print() {
		System.out.println("I am printable method");
	}
	public void show() {
		System.out.println("I am showable method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacePractice1 i1 = new InterfacePractice1();
		i1.print();
		i1.show();
		System.out.println(Printable.age);
	}

}
