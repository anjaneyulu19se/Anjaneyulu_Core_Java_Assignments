package com.javaAssignments;

import java.util.Scanner;

public class DifferenceOfSquares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any value");
		int n = scanner.nextInt();
		
		System.out.println(sumOfSquares(n)-squaresOfSum(n));
		scanner.close();
	}
	public static int sumOfSquares(int n) {
		int sum = 0;
		for (int i=1;i<=n;i++) {
			sum=sum+(i*i);
		}
		return sum;
	}
	public static int squaresOfSum(int n) {
		int sum = 0;
		for (int i=1;i<=n;i++) {
			sum=sum+i;
		}
		sum = sum*sum;
		return sum;
	}
}
