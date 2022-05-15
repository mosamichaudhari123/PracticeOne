package Array;

public class Array3 {

	public static void main(String[] args) {
		//Create an Array
		int[] age = new int[5];
		System.out.println("First Array:" +age[0]);
		System.out.println("Second Array:"+age[1]);
		System.out.println("Third Array:" +age[2]);
		System.out.println("Fourth Array:"+age[3]);
		System.out.println("Fifth Array:" +age[4]);
		
		System.out.println("*****Using For Loop:************");
		//if we can only normal for loop write down only for loop line and sop(); for print
		for(int i = 0; i < age.length; i++) {
		System.out.println(age[i]);
//			if(age[i] == 27) {
//				System.out.println(age[i]);
//				break;
//				}
//			else {
//				System.out.println("age is not 27...");
//			}
		}
		System.out.println("**********Using for each loop:*************");
		for(int a : age) {
			System.out.println(a);
			if(a == 27) {
				System.out.println(a);
				break;
			}
			else {
				System.out.println("Age is not 27...");
			}
		}

	}

}
