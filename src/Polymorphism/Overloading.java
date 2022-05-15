package Polymorphism;
 class shapes{
	 public void area() {
		 System.out.println("Find area:");
	 }
	 public void area(int r) {
		 System.out.println("Circle area :"+3.14*r*r);
	 }
	 public void area(double b,double h) {
		 System.out.println("Triangle area :"+0.5*b*h);
	 }
	 public void area(int l,int b) {
		 System.out.println("Rectangle area :"+l*b);
	 }
 }
public class Overloading {

	public static void main(String[] args) {
		shapes myshape = new shapes();
		myshape.area();
		myshape.area(5);
		myshape.area(3.0,2.4);
		myshape.area(3,2);

	}

}
