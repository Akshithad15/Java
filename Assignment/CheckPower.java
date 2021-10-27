package Assignment;

import java.util.Scanner;

public class CheckPower {
	static boolean checkNumber(int num) {
		int temp = 0;
		while(num != 1) {
			if(num % 2 == 0) {
				temp = 1;
				num /= 2;
			}
			else {
				temp = 0;
				break;
			}
		}
		if(temp == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		boolean flag = checkNumber(num);
		if(flag)
			System.out.println(num+" is power of 2");
		else
			System.out.println(num+" is not power of 2");
	}

}
