package hack.test;

public class Question16 {
	public static void main(String[] args) {
		
		Question16 q16 = new Question16();
		q16.removegivencharfromstring("Anu", 'u');
		q16.removegivencharfromstring("Ram", 'R');
		q16.removegivencharfromstring("samaira", 'a');
		
	} 

	public String removegivencharfromstring(String name, char c) {
		
		char[] myCArr = name.toCharArray(); 
		String app = "";
		for(int i = 0; i < myCArr.length; i++) {
			if(!(myCArr[i] == c) ) {
				app = app + myCArr[i];
			}
		}
		System.out.println("Result == "+app);
		
		return app;
	}
}
