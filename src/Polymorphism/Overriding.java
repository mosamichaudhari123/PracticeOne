package Polymorphism;

class Vehicle{
	void run() {
		System.out.println("vehicle is moving");
	}
}

//creating a child class
class Car extends Vehicle {
	//same method as in the parents class
	void run() {
		System.out.println("car is running safely");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.run();

	}

}
