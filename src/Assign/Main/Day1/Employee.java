package Assign.Main.Day1;

public class Employee {
	
	String empName;
	int empAge; 
	int empsalary; 
	
	public Employee(String name) {
		this.empName = name;
	}
	
	public Employee (String name, int age) {
		this.empName = name;
		this.empAge = age;
	}
	
	public Employee (String name, int age, int salary) { 
		this.empName = name; 
		this.empAge = age;
		this.empsalary = salary;
		
	}
	
	

} 

