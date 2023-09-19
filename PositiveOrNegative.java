package com.javaAssignments;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any value");
		int a = scanner.nextInt();
		if (a>0)
			System.out.println("Given value is Positive");
		else if(a<0)
			System.out.println("Given value is Negative");
		else
			System.out.println("Given value is Invalid(otherthan Integer)");
		
		scanner.close();
	}

}
