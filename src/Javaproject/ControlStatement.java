package Javaproject;

public class ControlStatement {

	public static void main(String[] args) {

		int number = 11;
		if (number >= 0) {
			System.out.println("number is positive = " + number);
		}

		if (number < 0) {
			System.out.println("number is negative = " + number);
		}
		System.out.println("--------------------------------");

		float marks = 67;

		if (marks >= 35 && marks <= 50) {
			System.out.println("You are eligible for arts stream");
		} else if (marks > 50 && marks <= 65) {
			System.out.println("You are eligible for commerce stream");
		} else if (marks > 65 && marks <= 75) {
			System.out.println("You are eligible for science stream");
		} else if (marks > 75) {
			System.out.println("Your eligible for computer science");
		} else {
			System.out.println("Sorry!! your not eligible for any stream, please repeat 10th");
		}

	}
}
