package Javaproject;

public class StringCreationAssignment {

	public static void main(String[] args) {
		//By using string literal
		String a = "Codemind Technology";
		
		System.out.println(a);
		System.out.println("------------------------");
		
		//By using keyword
		
		String a1 = new String ("Congratulations you are selected!!");
		
		System.out.println(a1);
		System.out.println("-------------------------");
		
		//String is immutable
		
		String First_Name = "Apurva";
		
		String Last_Name = "Kanade";
		
		System.out.println(First_Name.concat(Last_Name));
		System.out.println("----------------------------");
		
		//USING NEW KEYWORD
		char C[]= {'P','U','N','E'};
		String a2=new String (C);
		System.out.println(a2);
		System.out.println("-------------------------------");
		
		//By using charAt method
		String s = "Welcome to Goa!";
		System.out.println(s.charAt(11));
		System.out.println(s.charAt(9));
		System.out.println("---------------------------------");
		
		//By using concatination method
		System.out.println(s.contains(s));
		
		//By using contains method
		System.out.println(s.contains("Goa"));
		System.out.println("-----------------------------------");
		
		//by using lexicografically
		System.out.println(s.compareTo(a2));
		
		
		
	}

}
