package sam.test; 
import java.util.Scanner;

public class Factorial {
	public static void main(int[] arr) { 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("print factorial : ");
		int check = sc.nextInt();
		
		Factorial facti = new Factorial();
		int c = facti.Fact(check);
		System.out.println("Print Factorial of : " + c);
		
	
} 
	public int Fact(int n) {
		int f = 1; 
		for(int i = 1; i <= n; i ++) {
			n = i * f; 
		}
		return f;
	}
	
}
