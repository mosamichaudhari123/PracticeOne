package ArrayList;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList7 {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		System.out.println("Using siEmpty() method:"+l1.isEmpty());
		l1.add("Tirth");
		l1.add("hemali");
		l1.add("Kinay");
		l1.add("hetal");
		l1.add("bhuvansh");
		System.out.println("ArrayList:"+l1);
		
		ArrayList<String> l2 = new ArrayList<String>();		
		l2.add("Apu");
		l2.add("Anu");
		System.out.println("Updated ArrayList is:"+l2);
		
		l1.retainAll(l2);
		System.out.println("After using retainAll() method:"+l1);
		System.out.println("After usig retainAll() method l2 is:"+l2);
		System.out.println("iterating the elements after retaining the elements:");
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After using while loop:"+itr.hasNext());
		
		ArrayList l21 = new ArrayList();
		l21.add("Bhalod");
		l21.add("Jalgaon");
		l21.add(null);
		l21.add(true);
		l21.add(1234);
		System.out.println("After ArrayList elements:"+l21);

	}

}
