package Polymorphism;
class Bank {
	float getRateOfInterest( ) {
		return 0;
	}
}
class BANKOFBARODA extends Bank {
	float getRateOfInterest() {
		return 5.2f;
	}
}
class CANARA extends Bank {
	float getRateOfInterest() {
		return 8.2f;
	}
}
class ICICI extends Bank {
	float getRateOfInterest() {
		return 3.1f;
	}
}
public class PolyRuntime4 {

	public static void main(String[] args) {
		Bank b1 = new BANKOFBARODA();
		System.out.println("BANKOFBARODA Rate of Interest:"+b1.getRateOfInterest());
		b1 = new CANARA();//up casting
		System.out.println("CANARA Rate of Intrest:"+b1.getRateOfInterest());
		b1 = new ICICI();
		System.out.println("ICICI Rate of interest:"+b1.getRateOfInterest());

	}

}
