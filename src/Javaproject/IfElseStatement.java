package Javaproject;

public class IfElseStatement {

	public static void main(String[] args) {
		// If Statement
		int number = 25;
		if(number>=0) {
			System.out.println("Number is positive="+number);
		}
        
		System.out.println("----------------------------");
		
		// If Else statement
		char V = 'i';
		if(V == 'a' || V == 'e' || V == 'i' || V == 'o' || V == 'u') {
			System.out.println("character is vowel V ="+ V);
		}
		else {
			System.out.println("character is Constant V =" + V);
		}
	}

}
