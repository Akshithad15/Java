package Objects;

import java.util.Scanner;

public class EmploeeDetails {
	Address add = new Address();
	int empid;
	String name;
	String contact;
	char gender;
	String department;
	String designation;
	double salary;
	double percentage;

	EmploeeDetails(int empid, String name, String contact, char gender, String department, String designation,
			double salary, double percentage) {
		this.empid = empid;
		this.name = name;
		this.contact = contact;
		this.gender = gender;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.percentage = percentage;
		System.out.println("Enter Address");
		add.address();
	}

	void showDetails() {
		System.out.println("Employee ID: " + empid);
		System.out.println("Name: " + name);
		System.out.println("Contact: " + contact);
		System.out.println("Gender: " + gender);
		System.out.println("Address: ");
		add.showAddress();
		System.out.println("Department: " + department);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		commission(percentage);
	}

	void commission(double percentage) {
		double com = percentage / 100 * salary;
		System.out.println("Commission: " + com);
	}

}
