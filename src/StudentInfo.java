
public class StudentInfo {
	int id;
	String name;
	String address;
	
	StudentInfo(int StudentId,String StudentName,String StudentAddress){
	// constructor
	
			id=StudentId;
			name=StudentName;
			address=StudentAddress;
			
	}
	void StudentInfo() {
		System.out.println("id="+id);
		System.out.println("Name="+name);
		System.out.println("address="+address);
	}
	
		
		
		
	public static void main(String[] args) {
		// creating object below
		
	StudentInfo Riti=new StudentInfo(505,"Riti","Frisco");
	// constructor...insead s1, i asign name of student
    Riti.StudentInfo();
    	
    	
    	

	

}
}
