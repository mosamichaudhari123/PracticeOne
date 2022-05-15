package Polymorphism;
class Country {
	void city() {
		System.out.println("Jalgoan City :");
	}
	void pincode() {
		System.out.println("425301 Pincode:");
	}
}
class India extends Country {
	void city() {
		System.out.println("Ahmadabad City :");
	}
	void pincode() {
		System.out.println("425308 Pincode:");
	}
}
class Germany extends Country {
	void city() {
		System.out.println("Australia City");
	}
	void pincode() {
		System.out.println("425309 Pincode");
	}
}
public class PolyRuntime2 {

	public static void main(String[] args) {
	Country c1 = new Country();
	c1.city();
	c1.pincode();
	System.out.println("********************************");
	Country c2 = new India();
	c2.city();
	c2.pincode();
	System.out.println("*********************************");
	Country c3 = new Germany();
	c3.city();
	c3.pincode();

	}

}
