package amey;
class Car {
	Car(int a,int b) {
		System.out.println("Car Constructor Called:");
	}
	public void Moving() {
		System.out.println("Moving method is called:");
	}
}
class Farari extends Car {
	Farari() {
		super(25,30);
		System.out.println("Farari Constructor called:");
	}
	public void Driving() {
		System.out.println("Driving method is called:");
	}
	public void Wheelers() {
		System.out.println("Wheelers method is called:");
	}
}
public class InheritPractice8 {

	public static void main(String[] args) {
		Farari f1 = new Farari();
		f1.Driving();
		f1.Wheelers();
		f1.Moving();
	}

}
