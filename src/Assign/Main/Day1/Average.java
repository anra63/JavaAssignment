package Assign.Main.Day1;

public class Average {
 public int avg (int a,int b, int c) {
	 
	 int avg = (a+ b + c)/3;
	 return avg; 
	 
 }
 
 public static void main (String[] args) {
	 Average a1 = new Average();
	 System.out.println("Average of 3 numbers : " +a1.avg(2,6,4));
 }
}
