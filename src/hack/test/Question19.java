package hack.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Question19 {

	public static void main(String[] args) {
		 Question19 q19 = new Question19();
		 System.out.println("Result is");
		 q19.occurrence("anupriyayi");

	}
	public void occurrence(String name) {
		char[] c = name.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i =0; i < c.length; i++) {
			
			if(map.containsKey(c[i])) {
				Integer myIntVal = map.get(c[i]);
				myIntVal++;
				map.put(c[i], myIntVal);
			}else {
				map.put(c[i], 1);
			}
		}
		
		/*
		 * Iterator<String> iterator = map.keySet().iterator(); while
		 * (iterator.hasNext()) { String key = iterator.next(); System.out.println(key +
		 * ":" + map.get(key)); }
		 */
		Iterator<Character> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Character key = iterator.next();
			System.out.println("Key :  "+key+" Value : "+map.get(key));
		}
	}
	
	
	
}
