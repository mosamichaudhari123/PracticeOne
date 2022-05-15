package amey;
class Apple {
	static int a = 123;
	int b = 11;
	double c = 12.5;
}
class Berry {
	static int x = 456;
	int y = 22;
	double z = 21.5;
}
class Chiku {
	static int p = 67;
	int q = 56;
	double r = 87.5;
}
public class InheritPractice1 {
	
	public static void main(String[] args) {
		//Accessing static members
		System.out.println("Class Apple Static member:"+Apple.a);
		System.out.println("Class Berry Static member:"+Berry.x);
		System.out.println("Class Chiku Static member:"+Chiku.p);
		
		//Accessing Non static members
		Apple a1 = new Apple();
		System.out.println("Class Apple Non Static member:"+a1.b);
		System.out.println("Class Apple Non Static member:"+a1.c);
		Berry b1 = new Berry();
		System.out.println("Class Berry Non Static member:"+b1.y);
		System.out.println("Class Berry Non Static member:"+b1.z);
		Chiku c1 = new Chiku();
		System.out.println("Class Chiku Non Static member:"+c1.q);
		System.out.println("Class Chiku Non Static member:"+c1.r);
	}

}
