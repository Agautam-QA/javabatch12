
public class MethodOverriding {

	public static void main(String[] args) {
		// 
		login capOne=new login();
		capOne.loginApp();
		Newlogin city=new Newlogin();
		city.loginApp();
		
		

	}

}
class login{
	void loginApp() {
		System.out.println("Enter user name");
		System.out.println("Enter password");
		System.out.println("Click submit button");
	}
	
}
class Newlogin extends login{
	void loginApp(){
		System.out.println("Enter user name");
		System.out.println("Enter password");
		System.out.println("Enter the phone number");
		System.out.println("Click submit button");
		
	}
}
