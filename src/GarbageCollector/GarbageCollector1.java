package GarbageCollector;

public class GarbageCollector1 {

	public static void main(String[] args) {
		GarbageCollector1 gc = new GarbageCollector1();
		System.out.println("Object representation of gc:"+gc);
		System.out.println("Address :"+gc.hashCode());
		gc = null;
		System.gc();
		
	}
		//@Override
		protected void finalize() {
			System.out.println("finalize method...");
	}
}
