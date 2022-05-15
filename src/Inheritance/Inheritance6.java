package Inheritance;
class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class Inheritance5 extends A2,B2{
	
	Inheritance5(){
		super();//confusion 
	}
public class Inheritance6 {

	public static void main(String[] args) {
		Inheritance5 obj = new Inheritance5();
		obj.msg();

	}

}
/**
Que1]Is java supports multiple inheritance or not?
---> No
Que2]why java doesn't support multiple inheritance using classes?
---> java doesn't support multiple inheritance using classes,because an ambiguity.
--->When child class constructor executes and call its parent class constructor
   with the help of super statement,then super statement get confused for inherit two parent class
*/