package hack.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5 {
	
	public static void main(String[] args) {
		
		
	int[] myArr = {1,4,3,2,1,3,5,2,1,3,4,6,7,4,6};
	Arrays.sort(myArr); 
	
	int duplicate = 0;	
	List<Integer>uniquelist = new ArrayList<>();
	for (int i = 0; i<myArr.length;i++){
		if(!uniquelist.contains(myArr[i])) {
			uniquelist.add(myArr[i]);
		}else duplicate ++;
		
	}
	
	System.out.println("uniquelist== "+ uniquelist); 
	System.out.println("Duplicate value count== "+ duplicate);
	}

}
