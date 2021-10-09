import java.util.Scanner;

public class SumOFDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int sum = 0, rem = 0;
		while(num != 0) {
			rem = num % 10;
			num = num / 10;
			sum += rem;
		}
		System.out.println("Sum of digits in number: "+sum);
	}

}
