package ExceptionHandling;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is simple Language";
		String s1="Java is simple Language";
		String s3= new String("Java is simple Language");
		
		System.out.println(s);
		System.out.println(s.charAt(1));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,14));
		System.out.println(s.contains(s1));
		System.out.println(s.equals(s3));
		

	}

}
