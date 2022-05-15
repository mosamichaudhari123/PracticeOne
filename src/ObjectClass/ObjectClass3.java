package ObjectClass;

public class ObjectClass3 {
	static int roll_no1 =100;
	int roll_no2;
	
	ObjectClass3() {
		int roll_no2 = roll_no1;
		roll_no2++;
	}
	
	@Override
	public int hashCode() {
		return roll_no2;
	}
	public static void main(String[] args) {
		
		 ObjectClass3 s = new  ObjectClass3();

		// Below two statements are equivalent
		 System.out.println(s);
		 System.out.println(s.toString());
		 System.out.println(s.hashCode());
	}

}
