import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int temp = num;
		int rev = 0;
		int rem = 0;
		while(num != 0) {
			rem = num % 10;
			rev = (rev * 10 ) + rem;
			num = num / 10;
		}
		if (temp == rev)
			System.out.println("Its is a Palindrome");
		else
			System.out.println("Its is not a Palindrome");
	}

}
