package hack.test;

public class Question17 {
public static void main(String[] args) {
	Question17 tc = new Question17();
	tc.totc("Ramkumar7888");
} 

	public  void totc(String password) { 
		int uppercase = 0;
		int lowercase = 0;
		int digit = 0;
	char[] c = password.toCharArray();
		for(int i = 0;i < c.length; i++) {
			if(Character.isUpperCase(c[i])) {
				uppercase++;		
			}
			
			if(Character.isLowerCase(c[i])) {
				lowercase++;		
			} 
			if(Character.isDigit(c[i])) {
				digit++;		
			}
		}
		
		System.out.println("total count of uppercase : "+uppercase);
		System.out.println("total count of lowercase : "+lowercase);
		System.out.println("total count of digit : "+digit);
	}
		
}
