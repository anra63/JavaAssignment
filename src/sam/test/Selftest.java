package sam.test;

public class Selftest {
public int sum (int a, int b) {
	
	int sum = a + b;

	return sum;
} 

public static void main(String[] args) {
	Selftest s1 = new Selftest();
	
	System.out.println("Sum of 2 int : "+s1.sum(5, 3));
	int[] myTestArr1 = {10, 20, 30 ,40};
	System.out.println(" Invoking average fn with Test 1 = "+s1.average(myTestArr1));
	int[] myTestArr2 = {1, 1};
	System.out.println(" Invoking average fn with Test 1 = "+s1.average(myTestArr2));
	
	Vehicle v = new Vehicle();
	System.out.println(v.accelerate(12));
	
	Vehicle c = new Car();
	System.out.println(c.accelerate(14));
	

} 
public int  average (int[] arp) {
	
	int sum =0 ;
	for (int i = 0; i<arp.length; i++) {
	sum = sum + arp[i];  
	}
			
	System.out.println(sum);
	int avg = sum / arp.length ;
	System.out.println(avg);
	
	return avg;
	
} 
 
}
