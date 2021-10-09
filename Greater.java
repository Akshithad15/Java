import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int first = input.nextInt();
		System.out.println("Enter Second Number:");
		int second = input.nextInt();
		System.out.println("Enter Third Number:");
		int third = input.nextInt();
		if(first > second && first > third) {
			System.out.println("First number is greater = "+first);
		}
		else if(second > third) {
			System.out.println("Second number is greater = "+second);
		}
		else {
			System.out.println("Third number is greater = "+third);
		}
	}

}
