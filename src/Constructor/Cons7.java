package Constructor;

public class Cons7 {
	Cons7(int a){
		System.out.println("int a cons called:");
	}
	Cons7(double b, int c){
		System.out.println("double b, int c constructor called:");
	}
	Cons7(float g ,double d){
		System.out.println("float g ,double d constructor called:");
	}
	
	public static void main(String[] args) {
		Cons7 b = new Cons7(34);
		Cons7 b1 = new Cons7(67.5d,45);
		Cons7 b2 = new Cons7(34.7f,43.7d);
	}
}
