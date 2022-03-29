package ExceptionHandling;

public class UseOfThrows {
	
	public static void main(String[] args) {throws FileNotFoundException
		// TODO Auto-generated method stub
		UseOfThrows u=new UseOfThrows();
	     u.m1();
	}
	void m1()throws FileNotFoundException{
		readfile();
	}
	void readfile()throws FileNotFoundException{
		FileNotFoundException fs=new FileNotFoundException("C:\\Users\\anjana\\Desktop\\JavaProg\demo.java");
		u.m1();
	}

}
