import java.util.Scanner;

public class FlotingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = input.nextDouble();
		System.out.println("Enter the second number");
		double num2 = input.nextDouble();
		num1 = Math.floor(num1*1000);
		num2 = Math.floor(num2*1000);
		if(num1 == num2) 
			System.out.println("Both the numbers are same upto 3 decimal places");
		else
			System.out.println("Both the numbers are not same");
	}

}
