package hack.test;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		String b = "ram";
		
		System.out.println("My integer variable a value is == "+a);
		
		Animal cow = new Cow();
		
		System.out.println("Print cow sound == "+cow.whatSound());
		Animal horse = new Horse();
		System.out.println("Print horse sound == "+horse.whatSound());
		
	}

}
