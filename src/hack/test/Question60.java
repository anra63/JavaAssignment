package hack.test;

public class Question60 {

	public static void main(String[] args) {
		Question60 q60 = new Question60();
		int [] a = {1,2,3,4,5,6};
		int [] b = {1,2,3,4,5,6,7,8};
		int [] c = {1,2,3,4,5,6,7,8,9}; 
		int [] d = {1,2};
		int [] e = {1};
		int [] f = {};
		
		q60.arrayrev(b);
	}

	public int [] arrayrev (int[] arr) {  
		
		int[] resultArr = new int[arr.length];
		
		if (arr.length <3) {
			for (int i = arr.length-1; i >=0; i--) {
				System.out.println(arr[i]);
			}
		}
		
		for(int i = 2; i < arr.length; i++) { 
			//System.out.println(arr[i]);
				int check = i +1;
				//System.out.println("check == "+check);
			if( check % 3 == 0 ) {
				int counter = 0;
				while(counter !=3) {
				System.out.println(arr[i-counter]);
				counter++;
				}
			}else {
				System.out.println(arr[i]);
			}
			
			if( arr.length-1-i >= 3 ) {
				i = i + 2;
			}
		}
		
		return resultArr;
	}
}
