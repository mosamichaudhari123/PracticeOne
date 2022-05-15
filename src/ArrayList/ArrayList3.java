package ArrayList;
import java.util.ArrayList;
public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(null);
		l1.add(12345);
		l1.add(true);
		l1.add(false);
		l1.add("Banana");
		l1.add("Mango");
		l1.add("Apple");
		System.out.println("Elements size:"+l1.size());
		System.out.println("List of elements:"+l1);
		
		for(int i = 0; i<l1.size(); i++)
		{
			System.out.println("Using for loop:"+l1.get(i));
		}
		
		for(Object obj:l1)
		{
			System.out.println(obj);
		}
		System.out.println("Using for each loop:"+l1.get(1));
		
		l1.set(1,"papaya");
		System.out.println("Elements size:"+l1.size());
		System.out.println("List of elements:"+l1);
	}
	

}
