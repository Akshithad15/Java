package Assignment;

import java.util.Scanner;

public class NumberOfWordsLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = input.nextLine();
		int word = 1;
		int letter = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				word += 1;
			}
			else {
				letter += 1;
			}
		}
		System.out.println("Number of words: "+word);
		System.out.println("Number of character: "+letter);
	}

}
