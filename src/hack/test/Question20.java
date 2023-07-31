package hack.test;

import java.util.ArrayList;

public class Question20 {

	public static void main(String[] args) {
		Question20 q20 = new Question20();
		q20.totr("AnupriyaY3445"); 
		

	} 
	
	public void totr(String password) {  
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		int duplicatedNumbersCount = 0;
		
		ArrayList<Character> list = new ArrayList(); 
		
		char[] c = password.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(list.contains(c[i])) {
				duplicatedNumbersCount++;
			}else {
				list.add(c[i]);
			}
			
			if(Character.isUpperCase(c[i])) {
				uppercaseCount++;
			}
			if (Character.isLowSurrogate(c[i])) {
				lowercaseCount++;
			}
			
		}  
		System.out.println("duplicate uppersace count : "+uppercaseCount);
		System.out.println("duplicate uppersace count : "+lowercaseCount);
		System.out.println("duplicate uppersace count : "+duplicatedNumbersCount);
		
		
	}
	

}
