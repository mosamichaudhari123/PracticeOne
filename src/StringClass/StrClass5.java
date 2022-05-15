package StringClass;

public class StrClass5 {

	public static void main(String[] args) {
	String s1 ="I am Automation Tester,I am Manual Tester,I am recently working as a professor";
	System.out.println("Actual String:"+s1);
	String[] StrArray1 = s1.split(" ");
	for(String s:StrArray1) {
		System.out.println(s);
	}
	System.out.println("**********************************");
	String s2 = "I am Automation Tester";
	System.out.println("Actual String:"+s2);
	String[] StrArray2 = s2.split(" ", 3);
	for(String s:StrArray2) {
		System.out.println(s);
	}
	System.out.println("************************************");
	String s3 = "I am from bhalod";
	System.out.println("Actual String:"+s3);
	String[] str = s3.split(" ");
	String temp = "";
	for (String s:str) {
		System.out.println(s);
	}
	for(int i = str.length-1; i<=0; i--) {
		temp=temp+" "+str[i];
	}
	System.out.println("Reverse Statement:"+temp);
	System.out.println("*************************************");
	String s4 = "   I am Mosami   ";
	System.out.println("Actual String with spaces:"+s4);
	System.out.println("Actual String length:"+s4.length());
	System.out.println("Actual string Without spaces:"+s4.trim());
	System.out.println("Actual String length without spaces:"+s4.trim().length());
	System.out.println("*************************************");
	String s5 = "I    am   Mosami";
	System.out.println("Actual String without spaces:"+s5.trim());
	System.out.println("Actual String length without spaces:"+s5.trim().toString());
	
	}

}
