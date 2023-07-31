package Assign.Main.Day1;


import java.util.StringJoiner;

public class practice {
	
	private static final String BLANK = "";
		
public static void main(String[] args) {
	

	System.out.println("Main Sum Result == "+Main.sum(2, 3));
	  
	/*
	 * for (int i = 1; i <=5; i++) {
	 * 
	 * String myStr="";
	 * 
	 * for (int j = 1; j <=5; j++) { myStr = myStr+i; }
	 * 
	 * System.out.println(myStr); }
	 * 
	 * for (int i = 1; i <=5; i++) { StringBuilder sb = new StringBuilder(); for
	 * (int j = 1; j <=5; j++) { sb.append(j); } System.out.println(sb); }
	 */
	  for (int i =1; i <=5; i++) { 
		  String m = "";
		  for( int j =1; j<=i; j++) {
			  m = m+j;
		  } 
		  System.out.println(m);
	  } 
	  
	  
	  
	
	
	/*
	 * for (int i = 1; i <= 5; i++) { StringJoiner sj = new StringJoiner("");
	 * 
	 * int totalSpaceCount = 5; int noOfSpaces = totalSpaceCount - i;
	 * 
	 * for (int j = 1; j <= 5; j++) { if(noOfSpaces > 0) sj.add(" "); else
	 * sj.add("* ");
	 * 
	 * noOfSpaces--; } System.out.println(sj);
	 * 
	 * }
	 * 
	 * for (int i = 4; i > 0; i--) {
	 * 
	 * StringJoiner sj = new StringJoiner("");
	 * 
	 * int totalSpaceCount = 5; int noOfSpaces = totalSpaceCount - i;
	 * 
	 * for (int j = 1; j <= 5; j++) { if(noOfSpaces > 0) sj.add(" "); else
	 * sj.add("* ");
	 * 
	 * noOfSpaces--; } System.out.println(sj);
	 * 
	 * }
	 */
	
}
}
