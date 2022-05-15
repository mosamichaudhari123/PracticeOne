package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<String> a1 = new TreeSet<String>();
		a1.add("mosami");
		a1.add("bhaiyya");
		a1.add("hemali");
		a1.add("kinay");
		System.out.println("TreeSet elements are:"+a1);
		//Transversing elements
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Traversing element through Iterator in descending order");
		Iterator i = a1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(65);
		set.add(44);
		set.add(32);
		set.add(45);
		System.out.println("TreeSet elements are:"+set);
		System.out.println("first element value:"+set.pollFirst());
		System.out.println("After pollFirst(),TreeSet elements are:"+set);
		System.out.println("Last elements value:"+set.pollLast());
		System.out.println("After pollLast(),TreeSet elements are:"+set);
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("E");
		System.out.println("Initial Set:"+set2);
		System.out.println("Reverse Set:"+set2.descendingSet());
		System.out.println("Head Set:"+set2.headSet("C"));
		System.out.println("Head Set:"+set2.headSet("C",true));
		System.out.println("Subset:"+set2.subSet("A", "E"));
		System.out.println("SubSet:"+set2.subSet("A", false,"E", true));
		System.out.println("TailSet:"+set2.tailSet("C"));
		System.out.println("TailSet:"+set2.tailSet("C",false));
		
	}

}
