package thisstatement;

public class ThisStatement3 {
	ThisStatement3()
	{
		this('c',25.36);
		System.out.println("******Zero-Param*********");
	}
	ThisStatement3(int age)
	{
		System.out.println("******int-Param*********");
	}
	ThisStatement3(char c, double d)
	{
		this(25);
		System.out.println("******char-double-param*********");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisStatement3 t1=new ThisStatement3();
	}

}
