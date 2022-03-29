
public class PolyDemoOverloading {

	public static void main(String[] args) {
		// all have same method (int add)within same class
		//different number and diff. type of parameters
		
		PolyDemoOverloading p=new PolyDemoOverloading();
		System.out.println(p.add(20,40));
		System.out.println(p.add(20.20f,30.30f));
		System.out.println(p.add(10,20,30));

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
