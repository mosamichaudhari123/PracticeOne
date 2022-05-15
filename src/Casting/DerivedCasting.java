package Casting;
class Parent {
	void show() {
	System.out.println("I am show method:");	
	}
	void callme() {
		System.out.println("I am callme method:");
	}
}
class Child extends Parent {
	void readme() {
		System.out.println("I am readme method:");
	}
}
public class DerivedCasting {

	public static void main(String[] args) {
	System.out.println("Ref and Object both of child");
	//Object of Child class and reference of child class
	Child c1 = new Child();
	c1.show();
	c1.callme();
	c1.readme();
	
	// Creating a Parent class object but referencing it to a Child class
	Parent p1 = new Child();
	p1.show();
	p1.callme();
	
	Parent p2 =(Parent) c1;
	//or
	//Parent p2=c1;
	//or
	//Parent p2=(Parent)new Child();

	p2.show();
	p2.callme();
	}

}
