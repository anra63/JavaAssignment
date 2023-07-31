package hack.test;

import java.util.Map;
import java.util.TreeMap;

public class Question33 {

	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> hm = new TreeMap<>();
		
		hm.put(65, 100);
		hm.put(70, 150);
		hm.put(56, 90);
		hm.put(75, 190);
		hm.put(60, 95);
		hm.put(68, 110);
		
		System.out.println("Length of the circus : "+ hm.size());
		for(Map.Entry displaytree: hm.entrySet()) {
			System.out.println(displaytree.getKey()+" " +displaytree.getValue());
		}
		
	}

}
