import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int even = 0,odd = 0, rem = 0;
		while(num != 0) {
			rem = num % 10;
			num = num / 10;
			if(rem%2 == 0)
				even += rem;
			else
				odd += rem;
		}
		System.out.println("Sum of even digits in number: "+even);
		System.out.println("Sum of odd digits in number: "+odd);
	}

}
