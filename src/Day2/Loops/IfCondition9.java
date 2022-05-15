package Day2.Loops;

public class IfCondition9 {

	public static void main(String[] args) {
		int num = 1;
		if(num == 0 || num == 1) {
			System.out.println("Not a prime number:"+num);
		} else {
			if(num % num == 0) {
				System.out.println("Number is prime:"+num);
			}else {
				System.out.println( );
			}
		}

	}

}
