package Polymorphism;

class Car1 {
	void Drive() {
		System.out.println("Driving:");
	}
}
class Innova extends Car1 {
	void Drive() {
		System.out.println("DrivingInnova:");
	}
}
public class PolyRuntime3 {

	public static void main(String[] args) {
	Car1 c1 = new Innova();
	c1.Drive();

	}

}
