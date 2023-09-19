package com.javaAssignments;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any 3 values");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (a > b && a>c ) 
				System.out.println("The Greatest Number is: " + a);

		else if (b>a && b>c) 
				System.out.println("The Greatest Number is: " + b);
		else
			System.out.println("The Greatest Number is: " + c);		
		scanner.close();
	}

}
