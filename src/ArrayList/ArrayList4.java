package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList AL = new ArrayList();
		AL.add(true);
		AL.add(null);
		AL.add("Discover");
		AL.add("Splender");
		AL.add("Platina");
		AL.add("HeroHonda");
		AL.add(67890);
		System.out.println("Elements list:"+AL);
		System.out.println("List Size is:"+AL.size());
		AL.set(2, "Bike");
		System.out.println("Elements list:"+AL);
		System.out.println("Empty()"+AL.isEmpty());
		
		for(int i = 0; i<AL.size(); i++) {
			System.out.println("for loop iteratoin:"+AL.get(i));
		}
		for(Object obj:AL) {
			System.out.println(obj);
		}
		System.out.println("for each loop iteration:"+AL.get(1));
		
		// The forEach() method is a new feature, introduced in Java 8.
				AL.forEach(a -> {
					System.out.println(a);
				});
				
				System.out.println("Transversing list through iterator interface:");
				Iterator itr = AL.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println(itr.hasNext());
				
				System.out.println("\nwith used iterator object:");
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println(itr.hasNext());
				
				System.out.println("\ncreated new iterator object:");
				Iterator itr1 = AL.iterator();
				while(itr1.hasNext()) {
					System.out.println(itr1.next());
				}
				System.out.println(itr1.hashCode());
	}
	
}
