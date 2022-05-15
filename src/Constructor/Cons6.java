package Constructor;

public class Cons6 {
	Cons6(double d,double e2,long e){
		System.out.println("double d,double e2,long e para cons called:");
	}
	Cons6(float a,float s,float d){
		System.out.println("float a,float s,float d para cons callled:");
	}
	Cons6(double v,double z,short g){
		System.out.println("double v,double z,short g para Cons called:");
	}
	public static void main(String[] args) {
		Cons6 cx = new Cons6(42.4d,42.3d,2134545l);
		Cons6 cx1 = new Cons6(33.3f,23.3f,21.4f);
		Cons6 cx2 = new Cons6(12.3d,16.6d,65576);
		Cons6 cx3 = new Cons6(34.2d,65.4d,3434334);
		
	}

}
