package amey;
 interface Drawable1{
	 void draw();//by default public abstract
	 default void message() {
		 System.out.println("I am default method");
	 }
	 static int cube(int m ) {
		 return m*m*m;
	 }
 }
 
 class Circle1 implements Drawable1{
	 public void draw() {
		 System.out.println("Drawing Circle");
	 }
 }
 
public class InterfaceDefaultStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable1 obj = new Circle1();
		obj.draw();
		obj.message();
		System.out.println(Drawable1.cube(3));

	}

}
