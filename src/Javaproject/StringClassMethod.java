package Javaproject;

public class StringClassMethod {

	public static void main(String[] args) {
		String s = "Welcome to Lakshadweep";
		
		System.out.println(s.compareToIgnoreCase("Welcome to Goa"));
		System.out.println(s.compareToIgnoreCase("Welcome to Laksh"));
		
		//compare this string to the specified object
		System.out.println(s.equals("Welcome to pune"));
		System.out.println(s.equals("Welcome to Goa"));
		System.out.println(s.equals("Welcome to Lakshadweep"));
		System.out.println(s.equals("Welcome to Beed"));

		//compare two object same or not.
		System.out.println(s.hashCode());
		
		//starting at the specified index
		System.out.println(s.indexOf("Lakshadweep"));
		System.out.println(s.indexOf('L',3));
		
		//Return the index within this string of the last occurance of the specified character 
		System.out.println(s.lastIndexOf('k'));
		System.out.println(s.lastIndexOf('w'));
		
		System.out.println("Welcome to Lakshadweep".indexOf("w",0));
		
		//Returns true if, and only if, length() is 0.
		String a = "   ";
		System.out.println(a.isEmpty( ));
		System.out.println("".isEmpty( ));
		
	}

}
