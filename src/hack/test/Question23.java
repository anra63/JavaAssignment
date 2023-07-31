package hack.test;

public class Question23 {
	public static void main (String[] args) {
		
		findType(10);
		findType("Ram");
		findType(false);
		
	}
	
	public static void findType(Object obj) {
		if(obj instanceof Integer) {
			System.out.println("variable a is of type int");
		}else if (obj instanceof String) {
			System.out.println("variable a is of type string");
		}else {
			System.out.println("variable a is of type boolean");
		}
	}
}
