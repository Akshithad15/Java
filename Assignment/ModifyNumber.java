package Assignment;

import java.util.Scanner;

public class ModifyNumber {
	static int modifyNumber(int num) {
		String str = Integer.toString(num);
		String res = "";
		int len = str.length();
		for(int i = 0; i < len-1; i++) {
			int r = Math.abs(str.charAt(i+1) - str.charAt(i));
			res += r;
		}
		res += str.charAt(len-1);
		int result = Integer.parseInt(res);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int res = modifyNumber(num);
		System.out.println(res);
	}

}
