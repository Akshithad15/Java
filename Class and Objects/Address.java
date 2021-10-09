package Objects;

import java.util.Scanner;

public class Address {
	House house = new House();
	String city;
	String state;
	int pincode;

	void address() {
		Scanner input = new Scanner(System.in);
		house.houseDetails();
		System.out.println("Enter City");
		city = input.next();
		System.out.println("Enter State");
		state = input.next();
		System.out.println("Enter Pincode");
		pincode = input.nextInt();
	}

	void showAddress() {
		house.showHouse();
		System.out.println(city+"- "+pincode+",");
		System.out.println(state);
	}
}
