package Assignment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int temp = num;
		int rem = 0, res = 0;
		while(num != 0) {
			rem = num % 10;
			num = num / 10;
			res = (int) (res + Math.pow(rem, 3));
		}
		if(temp == res)
			System.out.println(temp+" is a Armstrong number");
		else
			System.out.println(temp+" is not a Armstrong number");
	}

}
