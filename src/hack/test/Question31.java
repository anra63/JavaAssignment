package hack.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack; 

public class Question31 {

	public static void main(String[] args) throws FileNotFoundException {
		
	File f1 = new File("C:\\Users\\anura\\OneDrive\\Desktop\\java-file-test.txt");
	Scanner sc = new Scanner(f1); 
	
	Stack<String> s1 = new Stack<String>(); 

	while(sc.hasNextLine()) {	
		s1.add(sc.nextLine());
		System.out.println(s1);
	}
	
	while(!s1.isEmpty()) {
		
		File f2 = new File("C:\\Users\\anura\\OneDrive\\Desktop\\java-write-test.txt");
		try {
			FileWriter writer = new FileWriter(f2);
			writer.write(s1.pop());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}

}
