
public class PolyDemo {

	public static void main(String[] args) {
		// we need to have different types of parameters
		PolyDemo p=new PolyDemo();
		p.add(20,40);
		System.out.println(p.add(20,40));
		System.out.println(p.add(20f, 30));
		//System.out.println(p.add(10,20,30,20));
		

	}
	int add(int a,int b) {
		return a+b;
		
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	float add(float a,float b) {
		return a+b;
	}

}
