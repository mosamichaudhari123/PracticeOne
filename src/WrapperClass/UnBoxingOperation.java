package WrapperClass;

public class UnBoxingOperation {
	// UnBoxing Operation
	
			Double dobj = 45.555555576;//autoboxing
			System.out.println("dobj: "+dobj);
			
			//only object can be unboxed
			double payment = dobj.doubleValue();//unboxing
			System.out.println(payment);
			System.out.println(dobj==payment);
			
			Boolean b = true;
			Boolean b1 = b.booleanValue();//unboxing
			
			Character c1 = new Character('a');//boxing
			char c2 = c1.charValue();
			
			Integer i1 = 27;
			double d = i1.intValue();
}
