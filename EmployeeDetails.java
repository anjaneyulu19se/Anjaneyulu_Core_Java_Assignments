package com.javaAssignments;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		int emp_id = scanner.nextInt();
		
		System.out.println("Enter Employee name: ");
		String emp_name = scanner.next();
		
		System.out.println("Enter Employee Salary: ");
		int emp_salary = scanner.nextInt();
		
		System.out.println("Enter Employee Address: ");
		String emp_Address = scanner.next();
		
		System.out.println("Enter Employee Contact: ");
		int emp_contact = scanner.nextInt();
		
		System.out.println("Enter Employee Gender: ");
		char emp_gender = scanner.next().charAt(0);
		
		System.out.println("Employee details:");
		System.out.println("Employee id: " + emp_id);
		System.out.println("Employee name: " + emp_name);
		System.out.println("Employee Salary: " + emp_salary);
		System.out.println("Employee Address: " + emp_Address);
		System.out.println("Employee Contact: " + emp_contact);
		System.out.println("Employee Gender: " + emp_gender);
		
		scanner.close();
	}

}
