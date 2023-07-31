package hack.test;

public class Question12 {

	public static void main(String[] args) {

		int myTestPalInt = 111;
		String myTestPalStr = "MalayalaM";
		
		String s1 = Integer.toString(myTestPalInt);
		isPalindrome(s1);
		isPalindrome(myTestPalStr);
		
	}
	
	public static boolean isPalindrome(String mystr) {

		char[] c = mystr.toCharArray();
		boolean result = pal(c);
		System.out.println("Palindrome - String == " + result);
		
		return result;
	}
	

	public static boolean pal(char[] arr) {
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			if (arr[i] != arr[j])
				return false;

		}
		return true;
	}
}
