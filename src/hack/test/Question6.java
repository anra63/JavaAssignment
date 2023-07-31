package hack.test;

public class Question6 {

	public static void main(String[] args) { 
		
		
		Question6 q6 = new Question6();

		int[] myTestArry2 = {2,8,5,3,9,4,1};
		
		
		int[] resultArr2 = q6.selectionsort(myTestArry2);
		
		for (int i = 0; i < resultArr2.length; i++) {
			System.out.println(resultArr2[i]);
		}
		
	} 
	
	public int[] selectionsort (int[] arr) { 
		for (int i = 0; i<arr.length; i++) {
			
		
		int currMinIndex = i;
	
		for (int j = i+1; j < arr.length; j++) {
			
			
			if(arr[i] > arr[j] ) {
				
				currMinIndex = arr[j];
				currMinIndex = j;
			}
			
		}
		
		//Swap Variables
		int temp = arr[currMinIndex];
		arr[currMinIndex] = arr[i];
		arr[i] = temp;
			
		}
			return arr;
	}

}
