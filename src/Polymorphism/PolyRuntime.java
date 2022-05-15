package Polymorphism;
class Animal{
	void eat() {
		System.out.println("Eat method:");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog extends Animal");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat extends Animal");
	}
}

public class PolyRuntime {

	public static void main(String[] args) {
		Animal A = new Animal();
		A.eat();
		Animal A1 = new Animal();
		A1.eat();
		Animal A2 = new Animal();
		A2.eat();

	}

}
