package Day2.Loops;

public class IfCondition {

	public static void main(String[] args) {
	//defining a variable
		int number = 55;
		//check if the number is divisible by 2 or not
		if(number%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
			IfCondition.CheckEvenOddNumber(700);
			CheckEvenOddNumber(711);
		}
	}
		static void CheckEvenOddNumber(int num)
		{
			//int num = 700;
			if(num%2==0) 
			{
				System.out.println("Given number is even number:"+num);
			}
			else
			{
				System.out.println("Given number is odd number:"+num);
			}
		}
		static void CheckEvenOddNumber2()
		{
			int num = 50;
			if(num%2 == 0)
			{
				System.out.println("Given number is even number:"+num);
			}
			else
			{
				System.out.println("Given number is odd number:"+num);
			}
		}
	}
	