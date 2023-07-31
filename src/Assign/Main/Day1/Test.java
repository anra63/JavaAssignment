package Assign.Main.Day1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RamLibrary Obj = new RamLibrary();
		Obj.myInstStr = "Anupriya";
		System.out.println("First Object myInstStr = "+Obj.myInstStr);
		
		System.out.println(Obj.MYSTRING);
		RamLibrary.MYSTRING = "Anu";
		System.out.println(RamLibrary.MYSTRING);
		//RamLibrary.myStaticMethod();
		
		RamLibrary ramLibObj1 = new RamLibrary();
		System.out.println(ramLibObj1.MYSTRING);
		
		ramLibObj1.myInstStr = "ramkumar";
		System.out.println("ramLibObj1 Object myInstStr = "+ramLibObj1.myInstStr);
		
		RamLibrary ramLibObj2 = new RamLibrary();
		
		Student mTest = new Student("Ram", 0);
		mTest.getstu_name();
		

	}

}
