import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Letter");
		String let = input.next();
		let = let.toLowerCase();
		if(let.length() > 1 || let.matches("[0-9]")) {
			System.out.println("Invalid Input");
		}
		else {
			if(let == "a" || let == "e" || let == "i" || let == "o" || let == "u")
				System.out.println("Its is a Vowel");
			else
				System.out.println("Its is a Consonant");
		}
	}

}
