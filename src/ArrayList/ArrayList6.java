package ArrayList;
import java.util.ArrayList;
public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(null);
		list.add(true);
		list.add("Mosami");
		list.add("Bhairav");
		list.add("Bhaiyya");
		System.out.println("ArrayList elements to be:"+list);
		list.add(1, "Moshi");
		System.out.println("After updating list elements to be:"+list);
		
		ArrayList list2 = new ArrayList();
		list2.add("Dipak");
		list2.add("Amey");
		System.out.println("updated list elements to be:"+list2);
		list.addAll(list2);
		System.out.println("After adding elements to be:"+list);
		
		ArrayList list3 = new ArrayList();
		list3.add("anushka");
		list3.add("nikita");
		System.out.println("second time updated elements to be:"+list3);
		list.addAll(list3);
		System.out.println("After adding elements to be:"+list);
		list.add(3, "monu");
		list.addAll(list3);
		list.addAll(1, list3);
		System.out.println("Afer adding elements to be:"+list);
		

	}

}
