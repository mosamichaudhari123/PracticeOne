package StringClass;

public class StrClass1 {

	public static void main(String[] args) {
		StrClass1 c1 = new StrClass1();
		System.out.println("String representation of an object because of toString():");
		System.out.println("Enter c1:"+c1);
		
		String s1 = "ComputerScience";
		String s2 = "ComputerScience";
		String s3 = "CoreJavaBasics";
		System.out.println("new object will be create in string constant pool:");
		System.out.println("Enter String s1:"+s1);
		System.out.println("s1 Char Count:"+s1.length());
		System.out.println("no object will be create as its a duplicate object, so 's2' will points to 's1' object:");
		System.out.println("Enter String s2:"+s2);
		System.out.println("s2 Char Count:"+s2.length());
		System.out.println("new object will be create in string constant pool:");
		System.out.println("Enter String s3:"+s3);
		System.out.println("s3 Char Count:"+s3.length());

		//compare s1 and s2 values
		System.out.println("s1 & s2 using equals:"+s1.equals(s2));
		//compare s1 & s2 based on address
		System.out.println("s1 & s2 using operator '==':"+(s1==s2));
		
		System.out.println("s1 & s3 using equals:"+s1.equals(s3));
		System.out.println("s1 & s3 using operator:"+(s1==s3));
		
		String s4 = new String("AutomationTesting");//two objects--> 1. in constant pool 2. in non-constant pool
		System.out.println("Print s4:"+s4);
		System.out.println("s1 & s4 using equals:"+s1.equals(s4));
		
		String s5 = new String("ComputerScience");
		System.out.println("Print s5:"+s5);
		System.out.println("s1 & s5 using equals:"+s1.equals(s5));
		
		String s6 = new String("TESTER");
		System.out.println("Print s6:"+s6);
		System.out.println("s1 & s6 using equals:"+s1.equals(s6));
		System.out.println("s1 & s6 using operators:"+(s1==s6));
		
	}

}
