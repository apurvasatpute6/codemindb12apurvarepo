package Javaproject;

public class TernaryOperator {

	public static void main(String[] args) {
		
		TernaryOperator ternaryOperator = new TernaryOperator();
		
		System.out.println("Eligible For Voting = " + ternaryOperator.eligibilityForVoting(19, "india"));
		
	}
	
	public boolean eligibilityForVoting(float age, String country) {
		boolean eligibilityForVoting;
		
		eligibilityForVoting = age >= 18 && country.equals("india") ? true : false;
		
		return eligibilityForVoting;

	}

}
