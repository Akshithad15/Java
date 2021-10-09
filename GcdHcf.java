import java.util.Scanner;

public class GcdHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		int gcd = 0;
		for(int i = 1 ; i <= num1 && i <= num2 ; i++) {
			if(num1%i == 0 && num2%i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD or HCF of "+num1+" and "+num2+" is: "+gcd);
	}

}
