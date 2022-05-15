package Array;

public class Array1 {

	public static void main(String[] args) {
		
//	int empID1 = 100,empID2 = 200,empID3 = 300;
//	int empID = {100,200,300};
//	Or
//	int[] empID = new int[3];
//	empID[0] = 100;
//	empID[0] = 200;
//	empID[0] = 300;
	
		int[] empID = {100,200,300};
		
		//Access the elements of an array
		System.out.println("Access the elements of an array:");
		System.out.println(empID[0]);
		
		//Change the array elements
		empID[0] = 500;
		System.out.println("Change the array elements:");
		System.out.println(empID[0]);
		
		//array elements count
		System.out.println("Array elements count:");
		System.out.println(empID.length);
		
		System.out.println("*********Normal for loop***********");
		//Iterate array elements using for loop
		for(int i = 0; i < empID.length; i++) {
			System.out.println(empID[i]);
		}
		
		System.out.println("**********For each loop************");
		for(int i : empID) {
			System.out.println(i);
		}
	}
}

/** for each loop:-
 * LHS should be same as RHS type in form of datatype or class
 * for(LHS : RHS){
 * 
 * }
 */