package Objects;

import java.util.Scanner;

public class House {
	int house;
	int flr;
	int room;

	void houseDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter House Number");
		house = input.nextInt();
		System.out.println("Enter Floor Number");
		house = input.nextInt();
		System.out.println("Enter Room Number");
		house = input.nextInt();
	}

	void showHouse() {
		System.out.println("#" + house + ", " + flr + " floor, " + room + " Room No.");
	}
}
