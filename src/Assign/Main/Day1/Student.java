package Assign.Main.Day1;

public class Student {
	
	private String stu_name ;
	int stu_roll_no ; 
	String stu_phone_no;
	private String stu_address;
	
	public String getstu_name() {
		return this.stu_name;
	}
	
	public void setStu_name(String name) {
		this.stu_name = name;
	}
	
	public Student(String name, int roll_no) {
		this.stu_name = name;
		this.stu_roll_no = roll_no; 
		
	}
	
	public Student (String name, int roll_no, String phone_no, String address) {
		 this.stu_name = name;
		 this.stu_roll_no = roll_no;
		 this.stu_phone_no = phone_no;
		 this.stu_address = address;
	}
  
	
	
}



	
	


