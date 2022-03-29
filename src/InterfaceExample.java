
interface Testinter{
	int a=10; // by default variable is static and final
	//void display() { (when i do this , error message says body doesn't define in interface)
	void display(); // so changed method with ; here.(this is now abstract method)
		
	}

//public class InterfaceExample {
	// this main class is also class so we can use as below:
	public class InterfaceExample implements Testinter{
		//void display() {// error message coz this method needs to be changed as public
		public void display() {
			System.out.println(a);
		}
	public static void main(String[] args) {
		// now let's call method creating object  below: 
		InterfaceExample ie=new InterfaceExample();
		ie.display();
		

	}

}

