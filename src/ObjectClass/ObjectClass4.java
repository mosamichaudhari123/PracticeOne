package ObjectClass;

public class ObjectClass4 {
	static int roll_no1 = 100;
	int roll_no;
	
	 ObjectClass4(){
		 int roll_no2 = roll_no1;
		 roll_no2++;
	 }
	 
	 @Override
	 public String toString() {
		 return "Java";
	 }
	public static void main(String[] args) {
		 ObjectClass4 s = new  ObjectClass4();

			// Below two statements are equivalent
			 System.out.println(s);
			 System.out.println(s.toString());
	}

}
