package Assignment;

import java.util.Scanner;

public class Mirror {
	static String getImage(String str) {
		StringBuffer rev = new StringBuffer();
		rev.append(str);
		rev.reverse();
		String s = rev.toString();
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = input.next();
		String res = getImage(str);
		System.out.println(str+" | "+res);
		
	}

}
