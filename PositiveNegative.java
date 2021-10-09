import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		if (num > 0) {
			System.out.println("Positive number");
		} else {
			System.out.println("Negative number");
		}
	}

}
