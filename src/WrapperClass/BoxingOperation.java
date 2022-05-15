package WrapperClass;

public class BoxingOperation {

	public static void main(String[] args) {
		
		//Boxing Operation
				int age = 27;
				System.out.println("Age:"+age);
				
				Integer object = 60;//implicit/auto boxing--->
				//java compiler convert it into Integer object = new Integer(60);
				System.out.println("Object: "+object);
				
				Integer intobject1 = new Integer(age);//explicit boxing operation
				System.out.println("intobject1 :"+intobject1);
				System.out.println(age==intobject1);
				
				Integer intobject2 = new Integer(age);//explicit boxing operation
				System.out.println("intobject2: "+intobject2);
				System.out.println(age==intobject2);
				
				Integer intobject3 = 50;//implicit boxing operation
				System.out.println("intobject3: "+intobject3);
				char c1 = 'M';
				Character abc = c1;//implicit boxing operation
				Character charobj1 = new Character(c1);
				System.out.println(c1);
				System.out.println(abc);
				System.out.println(charobj1);
				
				

	}

}
