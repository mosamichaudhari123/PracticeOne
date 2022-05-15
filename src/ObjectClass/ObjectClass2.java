package ObjectClass;

public class ObjectClass2 extends Demo {
	static int roll_no1 = 101;
	int roll_no2;
	
	 ObjectClass2(){
		 int roll_no2 = roll_no1;
		 roll_no2++;
	}
	public static void main(String[] args) {
		
		ObjectClass2 s = new  ObjectClass2();
		System.out.println(s);
		System.out.println(s.toString());

		Demo d1 = new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
	}

}
