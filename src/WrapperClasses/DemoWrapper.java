package WrapperClasses;

public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		Integer i1=new Integer(i);// primitive to obj
		System.out.println(i1);
		int i3=i1.intValue(); // obj to primitive 
		
		float f=40.5f;
		Float f1=new Float(f);
		float f2=f1.floatValue();
		System.out.println(f1);
		
		

	}

}
