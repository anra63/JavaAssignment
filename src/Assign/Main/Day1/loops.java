package Assign.Main.Day1; 

import java.util.Scanner;


public class loops { 
	
	
	public static void main(String[] args) {
		
		/*int x = 10;
		for (x = 10; x > 0; x--) { 
			System.out.println("Cute baby sam : X value == "+x ); 
			
		
		}
		
		System.out.println(x);
		
		int a = 10;
		while(a < 20 ) {
			System.out.println("abc");
			a++;
		}
		
		int c = 1;
		do {
			System.out.println("Hello world");
			c++;
		}
		while (c < 5); 
		
		
		
		Scanner myScanner = new Scanner(System.in);
		int n;
		System.out.println("Enter a Number : ");
		n = myScanner.nextInt();
		System.out.println("You have inputted number == "+n);
		for(int d = 1; d<= 10; d++)
		{
			//System.out.println(d);
			int multiply = d * n;
			//System.out.println("multiply value == "+multiply+"wjdhfsbdncsbdkchbsdk"+n);
			System.out.println("Multiplication "+n+" * "+d+" = "+multiply);
		}*/
		
		
	
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}

}
