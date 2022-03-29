
public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();
		

	}

}
class A{
	int a=40;
}
class B extends A{
	int a=50;
	void display(){
	
	System.out.println(super.a);
	}
}
