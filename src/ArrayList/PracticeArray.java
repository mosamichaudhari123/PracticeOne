package ArrayList;

public class PracticeArray {

	public static void main(String[] args) {
		int[] empId = { 10, 20, 30 };
		System.out.println("Access elements of an array:");
		System.out.println("Array elements count:" + empId.length);
		System.out.println(empId[0]);

		empId[0] = 1000;
		// for loop
		for (int i = 0; i < empId.length; i++) {
			System.out.println(empId[i]);
		}

		// for Each loop
		for (int i : empId) {
			System.out.println(i);
		}
		
		char[] getArray = new char[] {'A','B','C'};
		for(char num:getArray) {
			System.out.println(num);
		}

		int[] age = new int[2];
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println("Array elements count"+age.length);
		
		//for each loop
		for(int s:age) {
			System.out.println(s);
			if(s == 27) {
				System.out.println(s);
				break;
			}else {
				System.out.println("age is not 27");
			}
		}
	}

}
