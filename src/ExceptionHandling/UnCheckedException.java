package ExceptionHandling;

public class UnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		//System.out.println(a/0);

	
// result comes as: 
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at ExceptionHandling.UnCheckedException.main(UnCheckedException.java:8)*/
		
		// if we do a/1 instead of a/0 then
		System.out.println(a/1);// result comes 30
	}
}