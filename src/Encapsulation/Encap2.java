package Encapsulation;
class Test{
	//private data member
	private int studID;
	private double marks;
	
	//getter methods

	public int getStudID() {
		return studID;
	}
	//setter methods
	public void setStudID(int studID) {
		this.studID = studID;
	}
	//getter methods
	public double getMarks() {
		return marks;
	}
	//setter methods
	public void setMarks(double marks) {
		this.marks = marks;
	}
}
public class Encap2 {

	public static void main(String[] args) {
		
		Test  t1 = new Test();
		System.out.println("getter method getStudID:"+t1.getStudID());
		System.out.println("setter method setStudID:"+t1.getStudID());
		System.out.println("*******************************");
		t1.setStudID(32);
		t1.setMarks(354777);
		System.out.println("getter method getStudID:"+t1.getStudID());
		System.out.println("setter method setStudID:"+t1.getStudID());
	}
}
	
