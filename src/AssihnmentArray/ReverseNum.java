package AssihnmentArray;

public class ReverseNum {

	public static void main(String[] args) {
		int [] Num = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Original Number:");

		// for loop
		for (int i = 0; i < Num.length; i++) {
			System.out.println(Num[i] + "");
		}
		System.out.println("*****************");

		System.out.println("Reverse Number:");
		// for loop
		for (int i = Num.length-1; i >= 0; i--) {
			System.out.println(Num[i] + "");
		}
		
		System.out.println("*********************************");
		System.out.println(""+Num[1]);
		System.out.println("tostring method:"+Num.toString());//string representation of object
		System.out.println("hashcode method:"+Num.hashCode());//convert hexadecimal code into decimal 
		System.out.println("length method:"+Num.length);//length of number
		System.out.println("equals method:"+Num.equals(null));
		System.out.println("clone method:"+Num.clone());
	}
}
/* Output
Original Number:
1
2
3
4
5
*****************
Reverse Number:
5
4
3
2
1
*********************************
2
tostring method:[I@15db9742
hashcode method:366712642
length method:5
equals method:false
clone method:[I@6d06d69c

*/