package com.javaAssignments;
import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any value: ");
		int n = scan.nextInt();
		
		System.out.println(Calculatesum(n));
		scan.close();
	}
	public static int Calculatesum(int n) {
		int sum =0;
		for (int i = 0;i<=n;i++) {
			if (i%3==0 || i%5==0) {
				sum = sum+i;
			}
		}
		return sum;
	}
}
