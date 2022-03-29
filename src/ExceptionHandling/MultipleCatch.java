package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String s=null;
		int a[]= {10,30,40};
		int b=a[1]%2;
		System.out.println(a[2]);
		s.length();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException Block");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Block");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("This is finally Block");
		}
		System.out.println("This is end of program");
			
		}
		

	}


