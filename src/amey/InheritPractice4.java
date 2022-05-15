package amey;
class Animal {
	public void useful() {
		System.out.println("Useful method called:");
	}
}
 
class Dog extends Animal {
	public void Bark() {
		System.out.println("Bark method called:");
	}
}

class Cat extends Dog {
	public void Meow() {
		System.out.println("Meow method called:");
	}
}

public class InheritPractice4 {

	public static void main(String[] args) {
		Cat d1 = new Cat();
		d1.Bark();
		d1.useful();
		d1.Meow();

	}

}
