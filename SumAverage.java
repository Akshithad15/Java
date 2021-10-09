import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		double avr = 0;
		System.out.println("Enter 5 number");
		for (int i = 0; i < 5; i++) {
			a[i] = input.nextInt();
			sum += a[i];
		}
		avr = sum / 5;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avr);
	}

}
