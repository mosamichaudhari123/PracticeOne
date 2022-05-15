package overriding;
class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}
class Overriding4 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
public class overriding4{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding4 obj = new Overriding4();
		obj.myMethod();
	}

}