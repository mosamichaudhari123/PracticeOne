package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 extends Object{
	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
//		List L1 = new ArrayList();
		a1.add("Collection");
		a1.add(12794);
		a1.add(true);
		a1.add(null);
		System.out.println("Elements of List a1 is:"+a1);
		System.out.println("Elements size is:"+a1.size());
		a1.add(1, "ArrayList");
		System.out.println("Elements of List a1 is:"+a1);
		System.out.println("Elements size is:"+a1);
		System.out.println("Index specific elements:"+a1.get(2));
		
		for(int i = 0; i<a1.size(); i++) {
			System.out.println("Elements at index:"+i+":"+a1.get(i));
		}
		for(Object obj:a1) {
			System.out.println(obj);
		}
		}

//	
//	public String isEmpty() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	public void add(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	public void add(int i, String string) {
//		// TODO Auto-generated method stub
//		
//	}
}
