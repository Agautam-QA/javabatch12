
public class UseOfThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseOfThis u=new UseOfThis();
		u.m2();

	}
void m1() { // m1 method
	System.out.println("This is m1 method");
}
void m2() {
	m1();// m1 inside the m2 so no need to create object
	System.out.println("This is m2 method");
	
	
}
}
class demo{
	void m3() {
		UseOfThis u=new UseOfThis();
		u.m2();
	}
}
