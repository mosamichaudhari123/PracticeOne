package Day2.Loops;

public class IfCondition3 {

	public static void main(String[] args) {
		int num1 = 15,num2 = 30;
		if(!(num1 == num2))
		{
			System.out.println("Number1 is greater than number2");
		}
		else
		{
			System.out.println("Number1 is smaller than number2");
		}
		if(num1 > num2)
		{
			System.out.println("Number1 is greater than number2");
		}
		else
		{
			System.out.println("Number1 is smaller than number2");
		}
		if(num1 < num2)
		{
			System.out.println("Number1 is either equals to number2 or greater than number2");
		}
		else
		{
			System.out.println("Number1 is smaller than number2");
		}
		if(num1 == num2 || num1 > num2)
		{
			System.out.println("Number1 is either equals to number2 or greater than number2");
		}
		else
		{
			System.out.println("Number1 is smaller than number2");
		}
		System.out.println("**********************************");
		//45    30
		if(num1 == num2) //|| num1 < num2)
		{
			System.out.println("Number1 is equals to number2");
		}
		else
		{
			if(num1 < num2)
			{
				System.out.println("Number1 is greater than number2");
			}
			else
			{
				System.out.println("Number1 is smaller than number2");
			}
			int sub1 = 50,sub2 = 30;
			if(sub1 > 35 && sub2 > 35)
			{
				System.out.println("Pass.........");
			}
			else
			{
				System.out.println("Fail.........");
			}
		}
	}

}
