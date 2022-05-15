package Casting;
class tree{
	void flowers() {
		System.out.println("Colorful Flowers:");
	}
}
class branches extends tree{
	void fruits() {
		System.out.println("Sweet fruits:");
	}
}
class leaf extends branches{
	void seeds() {
		System.out.println("many seeds:");
	}
}
public class Casting1 {

	public static void main(String[] args) {
		branches b = new leaf(); // java compiler writes internally---> branches b = (branches) new leaf();
		b.flowers();
		b.fruits();
		//b.seeds();
		
		leaf l1 = new leaf();        //auto upcasting or implicit upcasting
		branches b1 = new leaf();    //auto upcasting or implicit upcasting
		branches b2 = l1;
		tree t1 = new leaf();        //auto upcasting or implicit upcasting
		tree t2 = l1;                //auto upcasting or implicit upcasting
		
		branches b3 = (branches) new leaf();  //explicit upcasting
		branches b4 = (branches) l1;		 //explicit upcasting
		tree t3 = (tree)new leaf();			 //explicit upcasting
		tree t4 = (tree) l1;				 //explicit upcasting
		
		tree t5 = new branches();			//implicit upcasting
		tree t6 = (tree) new branches();	//explicit upcasting		
	
	}

}
