package StringClass;

final class Immutclass{
	final String gender;
	final int payment;
	
	//Constructor
	Immutclass(String s1, int n1){
		gender = s1;
		payment = n1;
	}
	public String getGender() {
		return gender;
	}
	public int getPayment() {
		return payment;
	}
}
public class ImmutableClass {

	public static void main(String[] args) {
	
		 Immutclass im = new  Immutclass("female",76000);
		 System.out.println("Gender = "+im.getGender());
		 System.out.println("Payment = "+im.getPayment());
	}

}
