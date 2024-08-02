package Javaproject;

public class NestedIfElseOperator {

	public static void main(String[] args) {
		System.out.println("----------------------------------");
		//if-else-if statement
		int department = 5;
		
		if(department >0 && department <= 1) {
			System.out.println("Candidate is eligible for Civil Branch");
		}
		else if(department >=1 && department <= 3) {
			System.out.println("Candidate is eligible for Mech Branch");
		}
		else if(department >=3 && department <=5) {
			System.out.println("Candidate is eligible for Electrical Branch");
		}
		else {
			System.out.println("Candidate is not eligible for any post");
		}
	}

}



//nested if statement
String candidate="Apurva";
String nationality="Indian";
String department="Civil";
int marks=150;

if (nationality=="Indian") {
	
	if(department=="Civil") {
		
		if(marks>=150) {
			
			System.out.println("candidate is eligible for Junior engineer post="+candidate);
		}
		else {
			System.out.println("candidate marks is insufficient for Junior engineer post");
			}
	}
		else {
			System.out.println("Candidate must have passed in civil engineering");
		}
}
		else {
			System.out.println("candidate nationality must be Indian");
		}
}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
