package Assignment;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal = new Calculate();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int sum = cal.calculatesum(num);
		System.out.println(sum);
	}

}
