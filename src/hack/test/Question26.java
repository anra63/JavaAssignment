package hack.test;

import java.util.Arrays;

public class Question26 {

	public static void main(String[] args) {
		
		int [] Array1 = {4,5,7,8};
		int [] Array2 = {9,10,11,12};
		
		int first = Array1.length;
		int second = Array2.length;
		int [] result = new int[first+ second];
		
		System.arraycopy(Array1, 0, result, 0, first);  
		System.arraycopy(Array2, 0, result, first, second);  
		System.out.println(Arrays.toString(result));  
	}

}
