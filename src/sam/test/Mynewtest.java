package sam.test;

public class Mynewtest {

	public static void main(String[] args) {
		System.out.println("Step 1 sum :" );
		
		Mynewtest m1 = new Mynewtest();
		 int add = m1.sum(4, 9); 
		 
		 System.out.println("Sum of 2 int : "+ add); 
		 
		 
		
		System.out.println("Step 2 ");
		sum1(4,9); 
		
		int c1 = m1.calculation(5, 2, 1);
		System.out.println(c1);  
		
		int[] v = {1,2,3,4};
		m1.diff(v);
		
	} 
	
	public int sum (int a, int b) {  
		int sum = a + b;
		System.out.println("instance sum returning "+sum);
		return sum;
	}
	public static int sum1 (int a, int b) { 
		int sum1 = a + b; 
		System.out.println("static sum returning "+sum1);
		return sum1;
		
	} 
	
	public static String happen(String a, String b) {
		String con = a + b ;
		
		return con;
	} 
	
	public int calculation(int a, int b, int c) {
		int cal = a + b - c;
		
		return cal;
	} 
	
	public void diff(int[] arr) {
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
		 }
		
	}
	
}
