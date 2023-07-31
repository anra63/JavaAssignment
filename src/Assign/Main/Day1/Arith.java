package Assign.Main.Day1;

public class Arith { 

	public static void main(String[] arg) {
		
		
		int var = -5+8*6 ; 
		System.out.println("Output is "+var); 
		
		int b = (55+9)%9 ;
		System.out.println("Output is "+b);
		
		int c = 20+-3*5/8 ;
		System.out.println("Output is "+c) ;
		
		int d = 5+15/3*2-8%3 ;
		System.out.println("Output is "+d ) ; 
		
		int a1 = 10;
		int a2 = 20;
		
		int sum = a1 + a2;
		System.out.println(sum);
		
		int multiply = a1 * a2;
		System.out.println(multiply); 
		
		int sub = a1 - a2;
		System.out.println(sub);
		
		int div = a1 / a2; 
		System.out.println(div); 
		
		int mod = a1 % a2;
		System.out.println(mod); 
		
		double pie = 3.14; 
		int r = 3;
		
		double area = (pie*r*r);
        System.out.println(area); 
		
		double circle = (2*pie*r);
		System.out.println(circle);
		
		int width = 3;
		int height = 8;
		
		int area1 = (width*height);
		System.out.println(area1);
		
		int perimeter = (2*area1);
		System.out.println(perimeter); 
		
		int x = 1;
		int y = 2; 
		int temp; 
		
		 temp = x;
		 x = y;
		 y = temp; 
		 System.out.println("x is "+x);
		 System.out.println("y is "+y); 
		 
		 int h = 5;
		 if (h > 5) { 
			 System.out.println("tall male ");
		 } else 
		 { System.out.println(" petite ");} 
		 
		 int mark = 80;
		 switch (mark) {
		 case 80: 
			 System.out.println("A grade");
			 break;
		 case 70:
			 System.out.println("B grade");
			 break;
		 case 60:
			 System.out.println("C grade");
			 break;
			 default:
				 System.out.println("Fail");
		 } 
		 
		 
		 int v = 10;
		 int j = 12;
		 int l = 5; 
		 
		 if (v>j & v>l) { 
			 System.out.println("V is largest number ");
		 }
		 else if(j>v & j>l) 
		 { System.out.println("j is largest number ");
			 
		 }
		 else { System.out.println("l is largest number ");
			 
		 }
		 
		 if(v > j) {
			 if(v > l) {
				 System.out.println("V is the Largest Number");
			 }
		 }else {
			 if(j > l) {
				 System.out.println("J is the Largest Number");
			 }
			 else {
				 System.out.println("L is the Largest Number");
			 }
		 }
		
		 
		 
		 
		
		
				
		
	}
	
	
 
} 
