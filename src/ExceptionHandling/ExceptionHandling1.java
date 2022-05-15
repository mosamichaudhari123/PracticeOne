package ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
	System.out.println("Program Start Here...");
	//1.Abnormal Statements
	int i = 10;
	int j = i/0;//ArithmaticException
	System.out.println("result"+j);
	
	//2. Abnormal Statements
	int[] empIDs = new int[3];
	empIDs[3] = 101;//ArrayIndexOutOfBoundException
	
	//3.Abnormal Statements
	String str = null;
	System.out.println(str.length());//Null Pointer Exception
	
	//4.Abnormal Statements
	String s = "abc";
	int num = Integer.parseInt(s);//NumberFormatException
	System.out.println("Num:"+num);
	System.out.println("Program Ends Here....");
	
	}

}
