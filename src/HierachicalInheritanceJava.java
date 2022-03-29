

class Aa
{
	void show_A()
	{
		System.out.println("Super class A");
		
	}
}
class Bb extends Aa
{
	void show_B()
	{
		System.out.println("B is sub class of A");
	}
}
class Cc extends Aa
{
	void show_C()
	{
		System.out.println("C is sub class of A");
	}
}
class Dd extends Aa
{
	void show_D()
	{
		System.out.println("D is sub class of A");
	}

	public class HierachicalInheritanceJava {
public static void main(String[] args) {
		// now create objects for all sub classes
	Bb obj1=new Bb();
	Cc obj2=new Cc();
	Dd obj3=new Dd();
	// now call supper class A method
	obj1.show_A();
	obj1.show_B();
	
	obj2.show_A();
	obj2.show_C();
	
	obj3.show_A();
	obj3.show_D();
	
	
	

	}

}
}
