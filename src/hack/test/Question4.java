package hack.test;

public class Question4 {

	public static void main(String[] args) {

		int myTestPalInt = 111;
		String s1 = Integer.toString(myTestPalInt);

		char[] c1 = s1.toCharArray();
		System.out.println("Palindrome - Integer == " + pal(c1));
		
		
	}
	
	

	public static boolean pal(char[] arr) {
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			if (arr[i] != arr[j])
				return false;

		}
		return true;
	}
}
