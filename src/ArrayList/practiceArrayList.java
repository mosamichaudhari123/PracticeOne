package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class practiceArrayList {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		List l1 = new ArrayList();
		a1.add("mosami");
		a1.add(11234);
		a1.add(null);
		a1.add(true);
		System.out.println("element of list:"+a1);
		System.out.println("elements size:"+a1.size());
		System.out.println("specific element:"+a1.get(1));
		
		//for loop
		for(int i = 0;i < a1.size(); i++) {
			System.out.println("Elements at index:"+a1.get(i));
		}
		
		//For each loop
		for(Object obj:a1) {
			System.out.println(obj);
		}
		
		a1.forEach(a -> {
			System.out.println(a);
		});
		
	}

}
