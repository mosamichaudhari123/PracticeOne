package ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList9 {

	public static void main(String[] args) {
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		l2.add(44);
		l2.add(55);
		
		System.out.println("Using size method:"+l2.size());
		System.out.println("Adding List<Integer> elements:"+l2);
		Collections.sort(l2);
		System.out.println("After Sorting list:"+l2);
		Collections.reverse(l2);
		System.out.println("After reverse list:"+l2);
	}

}
