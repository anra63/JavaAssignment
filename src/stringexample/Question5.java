package stringexample;

public class Question5 {
	public static void main(String[] args) {
		
		int uppercase = 0; int lowercase = 0; int number = 0;
		String str = "Hello Java 8"; 
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);	
			if(ch >= 'A' && ch <= 'Z')
				uppercase++; 
				else if(ch >= 'a' && ch <= 'z') 
				lowercase ++;  
				else if(ch >= '0' && ch <= '9')
				number++;
				
		}
		
		System.out.println("count of uppercase : "+uppercase);
		System.out.println("count of lowercase : "+lowercase);
		System.out.println("count of number : "+number);
		
		
	}
}
