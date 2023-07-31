package Assign.Main.Day1;

public class Mod { 
	public static void main(String[] args) {
		Myutil j1 = new Myutil(8);
		
		int v1 = 10;
		int v2 = 10;
		
		System.out.println("My Instance Variable x == "+j1.x);
		System.out.println("My static Variable access thru obj == "+j1.y);
	
		System.out.println("my static variable y == "+Myutil.y); 
		System.out.println("My Instance Method Sum == "+j1.sum(v1, v2));
		System.out.println("My static method sub == "+Myutil.sub(30,20));
		System.out.println("My static method sub == "+j1.sub(30,20));
		
		//Employee emp = new Employe
	}

}
