package Assign.Main.Day1;

public class Main {
	
	int myInt = 4;

	public static void main(String[] args) {
	
		System.out.println("Sum == "+sum(30, 40));
		System.out.println("Sum == "+sub(30, 40));
		System.out.println("Sum == "+multiply(30, 40));
		System.out.println("Sum == "+divide(30, 40));
		
		Main myObj1 = new Main();
		Main myObj2 = new Main();
		myObj2.myInt = 5;
		System.out.println(myObj1.myInt);
		System.out.println(myObj2.myInt);
		
	
	}
	
	public static int sum(int a, int b) {
		
		return a +b;
	}
	
public static int sub(int a, int b) {
		
		return a -b;
	}

public static int multiply(int a, int b) {
	
	return a *b;
}
public static int divide(int a, int b) {
	
	return a /b;
}
	
	

}