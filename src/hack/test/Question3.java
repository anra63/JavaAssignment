package hack.test;
import java.util.Arrays;


public class Question3 { 
	
public static void main(String[] args) {
	
 
	Question3 q3 = new Question3();
	int[] myArr = {5, 1,2,7,3};
	q3.sortArray(myArr);
	
	for (int i = 0; i < myArr.length; i++) {
		System.out.println(myArr[i]);
	}
} 

 public  int[] sortArray(int[] arr) {
	 
	 Arrays.sort(arr);
	 return arr;
 }
 
  
	
}

