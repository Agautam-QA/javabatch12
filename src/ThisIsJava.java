
public class ThisIsJava {//variables
	int a;
	int b;
	public void setData(int a,int b) {// method
	this.a = a; //specifying variables with this keyword
	this.b = b;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisIsJava t=new ThisIsJava();
		
	t.setData(4,3);

	System.out.println(t.a);
	System.out.println(t.b);

	}

}
