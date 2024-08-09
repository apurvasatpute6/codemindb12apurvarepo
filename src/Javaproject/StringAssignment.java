package Javaproject;

public class StringAssignment {

	public static void main(String[] args) {
		//Print given string
		String s = "Welcome to Goa!";
		for (int i = 0; i < s.length();i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("------------------------");
		//Reverse the string
		for (int i = s.length()-1; i>0; i--) {
			System.out.print(s.charAt(i));
		} 
		System.out.println();
		System.out.println("------------------------");

		// check given string is palendron or not
		String S1 = "Apurva";
		String S2 = "";
		for (int i = S1.length()-1; i>0; i--) {
			S2 = S2 + S1.charAt(i);
		}
		if(S1.equals(S2)){
			System.out.println(S1 + "\n" + "given string is palendron=" + S2);
		} else {
			System.out.println(S1 + "\n" + "given string is not palendron=" + S2);
		}
		System.out.println("------------------------------------");
		//check number of words in given string
		//String S = "Welcome to Goa!";
		String a[] = s.split(" ");
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.print("number of words in given string is =" +a.length);
		System.out.println();
		System.out.println("-----------------------------------");
		
		//find number of characters
		//String s="Welcome to Goa!";
		int count = 0;
		for (int i = 0; i < s.length(); i++);
		    if (s.charAt(count)=='d') {
		    	count++;
		    }
		System.out.println("Count of 'd' in given string is="+count);
		System.out.println("------------------------------------------");	
		
		//Print first letter in words capital
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
