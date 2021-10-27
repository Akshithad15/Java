package Assignment;

import java.util.Scanner;

public class PositiveString {
	static Boolean positive(String str) {
		int temp = 0;
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) < str.charAt(i+1)) 
				temp = 1;
			else {
				temp = 0;
				break;
			}
		}
		if(temp == 1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = input.next();
		String s = str.toLowerCase();
		boolean flag = positive(s);
		if(flag)
			System.out.println("It is a Positive String");
		else
			System.out.println("It is not a Positive String");
		
	}

}
