package hack.test;
import java.util.Scanner;

public class Question1 {
public static void main (String[] args) { 
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter a value of A :");
	boolean a = sc.nextBoolean();
	System.out.println("Enter a value of B :");
	boolean b = sc.nextBoolean();
	System.out.println("Enter a value of C :");
	boolean c = sc.nextBoolean();
	
	Question1 q1 = new Question1();
	boolean  response  = q1.check(a, b, c);
	System.out.println("Calling method result == "+response);
	
	
}


public boolean check(boolean a, boolean b, boolean c) {
	if (a && b) {
		return true;
	}else if(a && c) {
		return true;
	}else if (b && c) {
		return true; 
		}else {
			return false;
		}
}

}
