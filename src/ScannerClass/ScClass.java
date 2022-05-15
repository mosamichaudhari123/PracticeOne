package ScannerClass;

import java.util.Scanner;

public class ScClass {

	public static void main(String[] args) {
		
		//Object creation of scanner class
		Scanner scRef = new Scanner(System.in);
		
		int age;
		double salary;
		float id;
		String name;
		boolean valid;
		
		//Initialization of variable using scanner class
		System.out.println("Enter age value from console:");
		age = scRef.nextInt();
		
		System.out.println("Enter salary value from console:");
		salary = scRef.nextDouble();
		
		System.out.println("Enter id value from console:");
		id = scRef.nextFloat();
		
		System.out.println("Enter name value from console:");
		name = scRef.next();
		
		System.out.println("Enter boolean value from console:");
		valid = scRef.nextBoolean();
		
		System.out.println("Enter age:"+age);
		System.out.println("Enter salary:"+salary);
		System.out.println("Enter id:"+id);
		System.out.println("Enter name:"+name);
		System.out.println("Enter valid:"+valid);
		
		int num1,num2;
		System.out.println("Enter the first number:");
		num1 = scRef.nextInt();
		System.out.println("Enter the second number:");
		num2 = scRef.nextInt();
		
		char op;
		System.out.println("Enter the Operator:");
		op = scRef.next().charAt(0);
		
		System.out.println("Addition of two numbers:"+addNumber(op,num1,num2));
		System.out.println("**************************************************");
	}

	static int addNumber(char op, int num1, int num2) {
		if(op == '+') {
			return num1 + num2;
		}else {
			return 0;
		}
	}
}
