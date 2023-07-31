package hack.test;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		
	 
			Scanner sc = new Scanner(System.in);
			System.out.println("Factorial of n :");
			int m =  sc.nextInt(); 
			
			Question28 mult = new Question28();
			int a = 5;
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


