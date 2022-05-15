package Array;

public class Array2 {

	public static void main(String[] args) {
		//declaration and instantiation 
		int a[]=new int[10];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		System.out.println(a[8]);
		System.out.println(a[9]);
		//Initialization
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		a[5] = 600;
		a[6] = 700;
		a[7] = 800;
		a[8] = 900;
		a[9] = 1000;
		System.out.println("Elements of array counts:"+a.length);
		
		System.out.println("Normal for loop:");
		//Transversing Array
		for(int i = 1; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("For each loop:");
		for(int i :a) {
			System.out.println(i);
		}
		
		char[] getArray =  new char[] {'A','B','C','D'};
		System.out.println("********For each loop*********");
		for(char num : getArray) {
			System.out.println(num);
		}
	}

}
