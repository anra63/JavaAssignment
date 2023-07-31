package hack.test;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Bubblesort bub = new Bubblesort();
		int[] myTestArry = {5,7,8,2,0};
		int[] resultArr = bub.bublesort(myTestArry);
		System.out.println("Bubble Sort Result = "+resultArr);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}

public int[] bublesort (int[] arr) {
		
		for (int i = 1; i<=arr.length; i++) {
			
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j] > arr[j+1]  ) {
					int temp = 0;
					
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
				}
				
			}
		}
		
		
		return arr;
	}
	
}
