package sam.test;

public class Insertionsort { 
	public static void main(String[] arr) {
		int[] myArr = {1,6,7,4,2,9,8,5,3};
		int[] resultArr = insertion(myArr);
		
		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i]+" ");
		}
	}

	public static int[] insertion(int[] args) {
		for(int i =1; i < args.length;i++) {
			for(int k=i, j = i-1; j >=0;j--,k--) { 

				if(args[k] < args[j]) {
					
					int temp = args[k];
					args[k] = args[j];
					args[j] = temp;
				}
				
			}
		}
		return args;
	} 
	
}
