package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayList2 extends Object{

	public static void main(String[] args) {
		ArrayList A1 = new ArrayList();
		List L1 = new ArrayList();
		A1.add("Active and Passive attack");
		A1.add(12345);
		A1.add(false);
		A1.add(null);
		A1.add("Types of attack");
		System.out.println("Elements of ArrayList:"+A1);
		System.out.println("Elements of ArraySize:"+A1.size());
		A1.add(2, "Attacks");
		System.out.println("Elements of ArrayList:"+A1);
		System.out.println("Elements of ArraySize:"+A1.size());
		System.out.println("Index specific elements:"+A1.get(1));
		
		for(int i = 0; i<A1.size(); i++) {
			System.out.println("Elements at index i:"+A1.get(i));
		}
		for(Object obj:A1) {
			System.out.println(obj);
		}
	}
//
//	public void add(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void add(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void add(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void add(String string) {
//		// TODO Auto-generated method stub
//		
}

