package Polymorphism;
class Bike {
	int speedlimit = 50;
}
class Honda extends Bike {
	int speedlimit = 70;
}
class Discover extends Bike {
	int speedlimit = 80;
}
public class PolyRuntime5 {

	public static void main(String[] args) {
		Bike b = new Bike();
		System.out.println(b.speedlimit);
		Bike b1 = new Honda();
		System.out.println(b1.speedlimit);
		Bike b2 = new Discover();
		System.out.println(b1.speedlimit);
	}

}
