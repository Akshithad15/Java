import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		float num = input.nextFloat();
		if(num == 0)
			System.out.println("Zero");
		else if(num < 0)
			System.out.println("Negative");
		else {
			System.out.println("Positive");
			if(num > 0 && num < 1)
				System.out.println("Small");
			if(num > 100000) 
				System.out.println("Large");
		}
			
		
	}

}
