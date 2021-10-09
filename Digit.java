import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int num = input.nextInt();
		System.out.println("Enter a digit");
		int digit = input.nextInt();
		String str = Integer.toString(num);
		int[] a = new int[str.length()];
		for (int j = 0; j < a.length; j++) {
			if (a[j] == digit) {
				System.out.println(digit + " is present in " + num);
				break;
			} else {
				System.out.println(digit + " is not present in " + num);
				break;
			}
		}
	}

}
