package ObjectClass;
class Demo{
	void display() {
		System.out.println("I am Display()....");
	}
}
public class ObjectClass1 extends Demo {
	static int id1 = 100;
	int id2;
	
	//constructor
	ObjectClass1(){
		int id2 = id1;
		id1++;
	}
	public static void main(String[] args) {
		ObjectClass1 s = new ObjectClass1();
		System.out.println(s);
		System.out.println(s.toString());
		
		Demo d1 = new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		
		Demo d2 = new Demo();
		System.out.println(d2);
		System.out.println(d2.toString());
	}

}
