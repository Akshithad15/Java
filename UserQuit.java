import java.util.Scanner;

public class UserQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int sum = 0;
		while (flag) {
			System.out.println("Enter a number");
			int num = input.nextInt();
			sum += num;
			System.out.println("Press q to quit or other letters to continue");
			char ch = input.next().charAt(0);
			if(ch == 'q') {
				System.out.println("Sum: "+sum);
				flag = false;
			}
			else
				flag = true;
		}
	}
}
