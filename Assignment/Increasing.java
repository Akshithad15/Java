package Assignment;

import java.util.Scanner;

public class Increasing {
	static boolean checkNumber(int num) {
		// TODO Auto-generated method stub
		int temp = 0;
		String str = Integer.toString(num);
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) < str.charAt(i+1)) {
				temp = 1;
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
			System.out.println(num+" is a increasing number");
		else
			System.out.println(num+" is not a increasing number");
	}

}
