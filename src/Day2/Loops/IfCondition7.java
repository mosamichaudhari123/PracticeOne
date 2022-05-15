package Day2.Loops;

public class IfCondition7 {

	public static void main(String[] args) {
		//Creating two variables for age and weight
		int age = 19;
		int weight = 51;
		//Applying condition on age and weight
		if(age >= 18) {
			System.out.println("Candidate age is:"+age);
			if(weight > 50) {
				System.out.println("You are eligible to donate blood");
			}else {
				System.out.println("You are not eligible to donate blood");
			}
		}else {
			System.out.println("Age must be greater than 18");
		}

	}

}
