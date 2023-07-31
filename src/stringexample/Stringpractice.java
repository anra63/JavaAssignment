package stringexample;

public class Stringpractice {

	public static void main(String[] args) {
		String s1 = " I Love Java Programming " ;
		s1 = s1.replaceAll(" ", "");
		System.out.println(s1);
		int count = s1.lastIndexOf('o') -s1.indexOf('o'); 
		System.out.println(count);
		

	}

}
