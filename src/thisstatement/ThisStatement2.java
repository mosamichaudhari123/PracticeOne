package thisstatement;

public class ThisStatement2 {

	ThisStatement2()
	{
		System.out.println("******Zero-Param*********");
	}
	ThisStatement2(int age)
	{
		this();
		System.out.println("******int-Param*********");
	}
	ThisStatement2(char c, double d)
	{
		this(25);
		System.out.println("******char-double-Param*********");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisStatement2 t3=new ThisStatement2('c',25.36);
	}

}
