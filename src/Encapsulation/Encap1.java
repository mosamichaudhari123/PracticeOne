package Encapsulation;

class Demo {
	private int empID = 1000;
	private double salary = 45000;

	// getter method
	public int getEmpID() {
		return empID;
	}

	public double getSalary() {
		return salary;
	}

	// setter method
	public void setEmpID(int e) {
		empID = e;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Encap1 {

	public static void main(String[] args) {

		Demo d1 = new Demo();
		System.out.println("Accessing getter concept:" + d1.getEmpID());
		System.out.println("Accessing getter concept:" + d1.getSalary());
		System.out.println("***********Updated*****************************");
		d1.setEmpID(1001);
		d1.setSalary(550000);
		System.out.println("Updated,Accessing getter concept:" + d1.getEmpID());
		System.out.println("Updated,Accessing getter concept:" + d1.getSalary());
		System.out.println("************************************************");
		Demo d2 = new Demo();
		System.out.println("Accessing getter concept:" + d1.getEmpID());
		System.out.println("Accessing getter concept:" + d1.getSalary());
	}

}
