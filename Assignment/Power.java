package Assignment;

import java.util.Scanner;

public class Power {
	static int calculateDifference(int num) {
		int power = 0,sum = 0;
		for (int i = 1; i <= num; i++) {
			power += Math.pow(i,2);
			sum += i;
		}
		int difference = power - (sum * sum);
//		System.out.println(sum);
//		System.out.println(power);
		return difference;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int diff = calculateDifference(num);
		System.out.println(diff);
	}

}
