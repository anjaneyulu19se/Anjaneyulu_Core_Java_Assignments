package com.javaAssignments;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any value");
		int n = scanner.nextInt();
		CheckNumber.cNumber(n);
		System.out.println("Increasing Number: " + cNumber(n));
	
	scanner.close();
	}
	public static boolean cNumber(int n) {
		String s = String.valueOf(n);
		for (int i=0;i< s.length()-1;i++) {
			if (s.charAt(i)<= s.charAt(i+1)) {
				continue;
			}else
				return false;
		}
		return true;
	}
}
