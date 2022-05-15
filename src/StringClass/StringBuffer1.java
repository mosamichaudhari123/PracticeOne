package StringClass;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Database");
		System.out.println("Original StringBuffer Value: "+sb);
		
		sb.append("SQL");
		System.out.println(sb);
		
		sb.insert(8, "Start");
		System.out.println(sb);
		
		sb.replace(3, 7, "XXXX");
		System.out.println(sb);
		
		sb.delete(3, 7);
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Pune is a vast city");
		sb1.reverse();
		System.out.println(sb1);
		
		System.out.println("***************************************");
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.append("HELLO");
		System.out.println(sb2.capacity());
		
		sb2.append("java is platform independent");
		System.out.println(sb2.capacity());
		
		sb2.append("java is portable");
		System.out.println(sb2.capacity());
	}

}
