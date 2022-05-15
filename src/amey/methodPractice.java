package amey;

public class methodPractice {
	
	static int empId = 101; //static global variable
	double salary = 15000.78; //non static global variable
	
//	//Non static method
//	public double getEmpSalary() {
//		System.out.println("Hi... You are in getEmpSalary()....");
//		return salary;
//	}
//	
//	//static method
//	public static int getEmpId() {
//		System.out.println("Hi...You are in getEmpId()....");
//		return empId;
//	}
	
	//static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static variable of empId:"+empId);
		methodPractice m1 = new methodPractice();
		System.out.println("Non static variable of salary:"+m1.salary);
	}

}
