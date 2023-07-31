package hack.test;

public class Question14 {
	public static void main (String[] args) {
	String act = "java code" ;
	String[] b = act.split(" ");
	System.out.println("b[0] is "+b[0]);
	System.out.println("b[1] is "+b[1]);

	String rev = "";
	for(int i = b.length-1; i >= 0; i--) {
		rev = rev+b[i]+" ";

	} 
	

	System.out.println("reverese String words :"+rev);
 }
}
