package ArrayList;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();//Generic
		al.add("Sonu");
		ArrayList<Integer> al1 = new ArrayList<Integer>();//generic
		al1.add(10);
		ArrayList<Boolean> al2 = new ArrayList<Boolean>();//generic
		al2.add(true);
		
		ArrayList<String> als3 = new ArrayList<String>();
		als3.add("Sonali");
		als3.add("Monali");
		als3.add("Shyam");
		als3.add("Ram");
		System.out.println("ArrayList elements are:"+als3);
		als3.remove(1);
		System.out.println("After removing 1st element:"+als3);
		System.out.println("Removing Ram from collection:"+als3.remove("Ram"));
		System.out.println("After removing Ram String:"+als3);
		
		ArrayList<String> als4 = new ArrayList<String>();
		als4.add("Kinay");
		als4.add("Hemali");
		System.out.println("Updated ArrayList elements:"+als4);
		als3.addAll(als4);
		System.out.println("After adding als4 into als3:"+als3);
		als3.removeAll(als4);
		System.out.println("After removing als4 elemnts:"+als3);
		
		// Removing elements on the basis of specified condition
//		if(als3.contains("Sonali")) {
//			als3.remove("Sonali");
//		}
//		System.out.println("After removing Sonali element:"+als3);
		als3.removeIf(str -> str.contains("Sonali"));
		System.out.println("After removing sonali element:"+als3);
		als3.clear();
		System.out.println("After clear method:"+als3);
	}

}
