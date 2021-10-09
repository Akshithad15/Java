import java.util.Scanner;

public class Fraction {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		int len = 0;
		int gcd = 0;
		int n1 = 0, n2 = 0;
		for(int i = 1 ; i <= num1 && i <= num2 ; i++) {
			if(num1%i == 0 && num2%i == 0) {
				gcd = i;
			}
		}
		if(num1 > num2)
			len = num1;
		else
			len = num2;
		for(int i = 1 ; i <= len ; i++) {
			if((gcd*i) == num1)
				n1 = i;
			if((gcd*i) == num2)
				n2 = i;
		}
		System.out.println("Fraction is: "+n1+"/"+n2);
	}
}
