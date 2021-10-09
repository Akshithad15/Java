import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b and c values");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double quad = (b * b) - (4 * a * c);
		double res1 = 0, res2 = 0;
		if(quad > 0) {
			res1 = (-b + Math.sqrt(quad)) / (2 * a);
			res2 = (-b - Math.sqrt(quad)) / (2 * a);
			System.out.println("Two roots are: "+res1+" and "+res2);
		}
		else if(quad == 0) {
			res1 = (-b) / (2 * a);
			System.out.println("Roots is: "+res1);
		}
		else {
			System.out.println("No real roots");
		}
	}

}
