
public class BufferBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello java welcome";
		StringBuffer sb = new StringBuffer("Hello java welcome");
		StringBuilder sb3 = new StringBuilder("bhkjjk");
		//StringBuilder sb1= "bhkjjk";
		System.out.println("new String="+s.concat("to java class"));
		s.concat("to java class");
		System.out.println(s);
		sb.append("to java class");
		System.out.println("String SB="+sb);
		
		
		String s1=new String();
		String s2=new String("Hello java");
		String s3=new String(sb);
		String s4=new String(sb3);
		


		
		
	}

}
