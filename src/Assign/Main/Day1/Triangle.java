package Assign.Main.Day1;

public class Triangle {
 
	public double area (int base, int height) {
		
		 double area = 0.5 * base * height;
		 return area;
	}
		
	
	public int perimeter (int base, int height, int width) {
		
		int perimeter = base + height + width;
		return perimeter;
	}
	
	public static void main (String[] args) {
		
		Triangle ar = new Triangle(); 
		System.out.println("Area of triangle is == "+ar.area(4, 5));
	
		
		Triangle pr = new Triangle();
	    System.out.println("Perimeter of Triangle is == "+pr.perimeter(4,5,3));
	    
		
	} 
	
	    
}
