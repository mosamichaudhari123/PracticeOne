package amey;
class a1 {
	static int a = 243;
	int b = 23;
	double c = 23.5;
}

class b1 extends a1 {
	static int x = 345;
	int y = 675;
	double z = 32.4;
}
class c1 extends b1 {
	static int p = 344;
	int q = 123;
	double r = 32.5;
}
public class InheritPractice2 {

	public static void main(String[] args) {
		//static members
		System.out.println("static members of class a1:"+a1.a);
		System.out.println("static member of class b1:"+b1.x);
		System.out.println("Static member of class c1:"+c1.p);
		//Non static member
		a1 aone = new a1();
		System.out.println("Non Static member of class a1:"+aone.b);
		System.out.println("Non Static member of class a1:"+aone.c);
		b1 bone = new b1();
		System.out.println("Non Static member of class b1:"+bone.y);
		System.out.println("Non Static member of class b1:"+bone.z);
		c1 cone = new c1();
		System.out.println("Non Static member of class c1:"+cone.q);
		System.out.println("Non Static member of class c1:"+cone.r);
		
	}

}
