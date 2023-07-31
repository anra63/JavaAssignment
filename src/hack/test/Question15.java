package hack.test;

import java.util.ArrayList;

public class Question15 {
public static void main(String[] args) {
	String act = "java is good python is also good";
	String [] b = act.split(" ");
	ArrayList<String> list = new ArrayList<>();
	for(int i = 0; i < b.length; i++) {
		if(!list.contains(b[i])) {
			list.add(b[i]);
		} 
		
	} 
	System.out.println("my unique list is : "+list);
}
}
