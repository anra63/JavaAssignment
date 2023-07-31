package hack.test;

public class Question13 {
	
	public static void main(String[] args) {
		String act = "javacode";

		char[] con = act.toCharArray();

		StringBuilder sb = new StringBuilder();
		
		
		for (int i = con.length - 1; i >= 0; i--) {
			sb.append(con[i]);
		}
		System.out.println("result :"+sb.toString());
	}
	
	
		
		
	
		
	
	
}

