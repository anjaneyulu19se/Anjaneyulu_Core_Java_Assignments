package com.javaAssignments;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First value: ");
		int a = scanner.nextInt();
		System.out.println("Enter Second value: ");
		int b = scanner.nextInt();
		System.out.println("Enter Third value: ");
		int c = scanner.nextInt();
		System.out.println("Enter Fourth value: ");
		int d = scanner.nextInt();
		System.out.println("Enter Fifth value: ");
		int e = scanner.nextInt();
		
		int sum = a+b+c+d+e;
		int avg = sum/5;
		System.out.println("Sum value is :" + sum);
		System.out.println("Average value is :" + avg);
	scanner.close();
	}

}
