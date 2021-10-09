import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int temp = 0;
		for (int i = 2; i <= num; i++) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0)
					temp += 1;
			}
			if (temp == 0)
				if (num % i == 0)
					System.out.println("Factors are:"+i);
				else
					temp = 0;
		}
	}
}
