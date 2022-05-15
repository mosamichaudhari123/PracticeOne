package Day2.Loops;

public class IfCondition2 {

	public static void main(String[] args) {
		int year = 2022;
		if(((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0))
		{
			System.out.println("LEAP YEAR");
		}
		else
		{
			System.out.println("Common Year Or NON LEAP YEAR");
		}
		System.out.println("Given year is leap year or not:"+CheckLeapYear(2020));
		
		System.out.println("Given year is leap year or not:"+CheckLeapYear(2010));
	}	
	static boolean CheckLeapYear(int year)
	{
		if(((year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0)))
		{
			System.out.println("Leap Year");
			return true;
		}
		else
		{
			System.out.println("Non Leap year");
			return false;
		}
	}

}
