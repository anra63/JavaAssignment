package hack.test;

import java.util.ArrayList;

public class Question18 {
	public static void main(String[] args) {
	Question18 q18 = new Question18();
	System.out.println("result :"+q18.dup("anupriyay", 'a')); 
	
} 

	public String dup(String name, char d) {
		String duplicate ="";
		ArrayList<Character> list = new ArrayList();
		
		char[] c = name.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(list.contains(c[i])) {
				duplicate = duplicate + c[i]; 
			}else {
				list.add(c[i]);
			}
		} 
			return duplicate;
	}
}
