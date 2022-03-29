
public class Abstract {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dog d=new Dog();
		//d.bark();
		// this formula works in regular class but not in abstract class
		
		Husky h=new Husky();// we need extend class to execute
		h.bark();
		h.jump();

}
}
abstract class Dog{  // main abstract class
	
	String breed;
	public void bark() {
		System.out.println("Bark");
	}
	public abstract void jump();
}
class Husky extends Dog{//now only this extends class makes above abstract work in main class
	public void jump(){
		System.out.println("Dog Jumps");
		
	}

}

