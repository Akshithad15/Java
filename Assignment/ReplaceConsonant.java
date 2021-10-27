package Assignment;

import java.util.Scanner;

public class ReplaceConsonant {
	static String alterString(String str) {
		StringBuffer s = new StringBuffer();
		s.append(str);
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
					s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
					continue;
			else {
				if(s.charAt(i) == 'z') {
					s.setCharAt(i, 'a');
				}
				else if(s.charAt(i) == 'Z') {
					s.setCharAt(i, 'A');
				}
				else {
					int ascii = s.charAt(i)+1;
					char ch = (char)ascii;
					s.setCharAt(i, ch);
				}
				
			}
		}
		String res = s.toString();
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = input.next();
		String result = alterString(str);
		System.out.println("Original String: "+str);
		System.out.println("Modified String: "+result);
	}

}
