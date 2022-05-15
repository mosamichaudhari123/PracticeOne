package ThisKeyword;

public class ThisKeyword2 {
	int x;
	// Constructor with a parameter
	public ThisKeyword2(int x) {
		System.out.println("Local variable x: "+x);
		System.out.println("Global variable x: "+this.x);
		this.x = x;
		System.out.println("Local variable x: "+x);
		System.out.println("Global variable x: "+this.x);
	}
	// Call the constructor
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword2 myObj = new ThisKeyword2(45);
		System.out.println("Value of x = " + myObj.x);//
	}

}
