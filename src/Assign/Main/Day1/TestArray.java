package Assign.Main.Day1;

import java.util.Arrays;

public class TestArray {  
	
	public static int linsearch (int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				
				
				
				

				return i;
			} 
			
		}
		return -1;
	}
	public static void main(String[] args) { 
		int b[] = {10,6,90,55,88};
		int key = 55; 
		System.out.println(key+" found at index :" + linsearch(b, key));
		
		int[] s = {200,566,324,97,123};
		  int bkey = 566;
		  System.out.println(bkey+ "  Find key value :"+ findvalue(s, bkey));
		  
		  int [] myArr = new int[4];
		  System.out.println("After Removing Element ");
		  remelem(s, bkey); 
		  
		  int [] c = {1,8,-3,5,10};
		  int largest = c [0]; 
		  for (int i = 0; i < c.length; i++) {
			  if (c[i] > largest) { 
				  largest = c[i];
				  
			  }
		  } 
		  System.out.println(largest);
		
		  int [] min = {3,9,5,1,2};
			int smallest = min[0];
			for (int i =0; i < min.length; i++) {
				if (min[i] < smallest) {
					smallest = min[i];
				}
			} 
			System.out.println(smallest);  
		  
		  
			int [] var = {1,8,7,3,6};
			int sum = 0;
			for (int i = 0; i < var.length; i++) {
				sum = sum + var[i];
			} 
			System.out.println(sum); 
			 float avg = sum / var.length ; 
			 System.out.println(avg); 
			 
			 
			 int[] sam = {3,7,5,2,9}; 
			 Arrays.sort(sam);  
			 for(int i = 0; i < sam.length; i++)
			 System.out.println(sam[i]);
			 
	} 
	 
	
	
	public static boolean findvalue(int[] arr, int key) {
		for(int i =0; i< arr.length; i++) {
			if (arr [i] == key) {
				
				return true; 
			}
		} 
		        return false; 
	}
  
  
	public static void remelem (int[] inpArr, int key) {
		
		
		for(int i=0;i<inpArr.length;i++) {
		
		
			if(inpArr[i]==key) {
				inpArr[i] = inpArr[i+1];
			} 
				
			
			
		}
		
		for(int i=0;i<inpArr.length;i++) {
			
			
			System.out.println(inpArr[i]);
			
			
		}
		
		
	}
	
}
