package Objects;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int empid = input.nextInt();
		System.out.println("Enter Name");
		String name = input.next();
		System.out.println("Enter Contact");
		String contact = input.next();
		System.out.println("Enter Gender");
		char gender = input.next().charAt(0);
		System.out.println("Enter Department");
		String department = input.next();
		System.out.println("Enter Designation");
		String designation = input.next();
		System.out.println("Enter Salary");
		double salary = input.nextDouble();
		System.out.println("Enter Commission Percentage");
		double percentage = input.nextDouble();
		EmploeeDetails emp = new EmploeeDetails(empid, name, contact, gender, department, designation, salary,
				percentage);
		emp.showDetails();
	}

}
