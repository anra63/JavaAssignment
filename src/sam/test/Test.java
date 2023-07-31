package sam.test;
import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) { 
		
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter int value a : ");
	int a = sc.nextInt();
	System.out.println("enter int value b :");
	int b = sc.nextInt();
	
	Test t = new Test();
	int check = t.minus(a,b);
	System.out.println("subtraction method : "+check);
	
	
} 
	public int minus(int a, int b) {
	int	sub = a - b; 
	return sub;
	} 
	 
}
