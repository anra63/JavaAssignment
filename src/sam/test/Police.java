package sam.test;

public class Police {
	
  private String name;
  private int age; 
  private int salary;
  
	public Police(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public Police(String name) {
		this.name = name;
	}

	public Police(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
