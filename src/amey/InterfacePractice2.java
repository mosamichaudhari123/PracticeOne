package amey;
interface Printable11 {
	void print();
}
interface Showable11 {
	void print();
}

 public class InterfacePractice2 implements Printable11,Showable11 {
	public void print() {
		System.out.println("I am print method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacePractice2 obj = new  InterfacePractice2();
		obj.print();
		Showable11 s1 = new InterfacePractice2();
		s1.print();
		Printable11 p1 = new InterfacePractice2();
		p1.print();
		
	}

}
