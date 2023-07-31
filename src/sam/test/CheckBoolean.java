



package sam.test; 
import java.util.Scanner;

public class CheckBoolean {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("print boolean a");
		boolean a = sc.nextBoolean();
		System.out.println("print boolean b");
		boolean b = sc.nextBoolean(); 
		System.out.println("print boolean c");
		boolean c = sc.nextBoolean();
		
		
		CheckBoolean bool= new CheckBoolean();
		boolean p = bool.check(a, b, c);
		System.out.println("enter value : " + p);
		
	} 
	
	public boolean check(boolean a, boolean b, boolean c) {
		
		if (a && b) {
		return true;
		} else if (b && c) {
			return true;
		}	else if (a && c) {
			return true;
		}
		return false;
	
		
	}
	
}
