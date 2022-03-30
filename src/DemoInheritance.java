
public class DemoInheritance {
public static void main(String[]args) {
	//
	B b=new B(); // created object
	System.out.println(b.d);
	b.printNumber();
	System.out.println("b="+b.b+" c="+b.c);
	b.display();
}
}


class A{
	int b=30;
	int c=40;
	void display() {
		System.out.println("b="+b+"c="+c);
	}
}

class B extends A{
	int d=50;
	void printNumber() {
		
		class C extends A{
			int e=60;
			void print(){
			}
		}
		
	}
}
