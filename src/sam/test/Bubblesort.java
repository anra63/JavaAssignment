package sam.test;

public class Bubblesort { 
	public static void main (String[] arr) { 
		int b[] = {1,7,5,3,2};
		Bubblesort bub = new Bubblesort();
		int[] sortbub = bub.bubblesort(b); 
		
		for(int i = 0; i < sortbub.length; i++)
		System.out.println("bubble sort order :"+sortbub[i]);
		
		
		
	}
	public int[] bubblesort(int[] args) {
		for(int x = 0;x < args.length;x++) {
			
			for(int i=0, j = 1; i < args.length-1-x; j++,i++) { 
				
				if(args[i] > args[j]) {
					int temp = 0;
					
					temp = args[j];
					args[j] = args[i];
					args[i] = temp;
				}
				
			}
			
																																																																																																																																																																																																																							}return args;
	}
}
