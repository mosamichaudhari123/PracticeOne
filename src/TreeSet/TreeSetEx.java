package TreeSet;

import java.util.Map;
import java.util.TreeMap;

public class TreeSetEx {

	public static void main(String[] args) {
		Map m1 = new TreeMap();
		m1.put("key1", "admin");
		m1.put("key5", "admin");
		m1.put("key3", "admin123");
		m1.put("key0", "admin");
		System.out.println("Map elements are:"+m1);
		System.out.println("Map element count:"+m1.size());

	}

}
