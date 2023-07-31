package hack.test;
import java.util.Scanner;

public class Question2 {
public static void main (String[] args) { 
	Scanner sc = new Scanner(System.in);
	System.out.println("Factorial of n :");
	int m =  sc.nextInt(); 
	
	Question2 mult = new Question2();
	System.out.println( mult.factorial(m));
} 

public int factorial(int n) {
	int fact = 1; 
	for(int i = 1; i <= n; i++) {
		fact = i * fact;
	}
	return fact;
}
}
