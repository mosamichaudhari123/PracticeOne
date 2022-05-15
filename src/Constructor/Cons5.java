package Constructor;

public class Cons5 {
	double ratio;

	Cons5(double r) {
		ratio = r;
		System.out.println("double r cons called:"+ratio);
	}

	void AboutRatio() {
		System.out.println("AboutRatio constructor called:" + ratio);
	}

	public static void main(String[] args) {
		Cons5 cd = new Cons5(34.5d);
		cd.AboutRatio();
		System.out.println("Non static member called:" + cd.ratio);
	}

}
