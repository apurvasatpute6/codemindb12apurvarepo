package Javaproject;

public class StringMethod {

	public static void main(String[] args) {
		String s = "LAKSHADWEEP IS BEAUTIFUL ISLAND";
		//1.converts all of the characters in this string to lower case
		System.out.println(s.toLowerCase());
		System.out.println("------------------------------------");
		
		//2.converts all of the characters in this string to Upper case
		System.out.println(s.toUpperCase());
		System.out.println("------------------------------------");
		
		//3.Returns a string resulting from replacing all occurrences of oldchar in this 
		//string with newChar.
		System.out.println(s.replace('A','a'));
		System.out.println("-------------------------------------");
		
		//4.Replaces each substring of this string that matches the literal target 
		//sequence with the specified literal replacement sequence.
		System.out.println(s.replace("LAKSHADWEEP","GOA"));
		System.out.println("-------------------------------------");
		
		//6.Tests if this string starts with the specified prefix.
		System.out.println(s.endsWith("ISLAND"));
		System.out.println(s.startsWith("ISLAND"));
		System.out.println("-------------------------------------");
		
		//7.Returns a string that is a substring of this string
		System.out.println(s.substring(15));
		System.out.println("-------------------------------------");
		
		//8.Returns a string that is a substring of this string. The substring begins at
		//the specified beginIndex and extends to the character at index endIndex -1.
		System.out.println(s.substring(15,20));
		System.out.println("-------------------------------------");
		
		//9.Splits this string around matches of the given regular expression.
		String S2[] = s.split("A");
		for (int i = 0; i < S2.length; i++) {
			System.out.println(S2[i]);
		}
		
		String s1 = "      LAKSHADWEEP         ";
		System.out.println("-------------------------------------");
		
		//10.Return a string whose value is this string, with any leading and trailing
		//whitespace removed
		
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println("-------------------------------------");
		
		String aa = "abfd@!$^&%*$AAFSHJF153909**";
		
		//11.Replaces each substring of this string that matches the given regular
		//expression with the given replacement.
		
		System.out.println(aa.replaceAll("[0-9]",""));
		System.out.println(aa.replaceAll("[A-Za-z0-9]",""));
		System.out.println(aa.replaceAll("[a-zA-Z0-9]",""));
		System.out.println("-------------------------------------");
		
		//12.Replace the first substring of this string that matches the given regular expression with the given replacement.
		System.out.println(aa.replaceFirst("[abfd]", ""));
		System.out.println("-------------------------------------");
		
		//13.Return the string representation of the char argument.
		String aa1 = String.valueOf("Apurva");
		System.out.println(aa1.length());
		System.out.println("-------------------------------------");
	}

}
