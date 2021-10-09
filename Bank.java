import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int balance = 1000;
		int amt = 0;
		boolean flag = true;
		System.out.println("Hello");
		while (flag) {
			System.out.println("Type of Account\nPress");
			System.out.println("1 - Savings\n2 - Current\n");
			int choice1 = input.nextInt();
			switch (choice1) {
			case 1: {
				System.out.println("Savings Account");
				System.out.println("Enter your PIN");
				int pin = input.nextInt();
				System.out.println("Press\na - Deposite\nb - Withdrawal\nc - Check balance");
				char choice2 = input.next().charAt(0);
				switch (choice2) {
				case 'a':
					System.out.println("Enter the amount to be Deposited");
					amt = input.nextInt();
					balance += amt;
					System.out.println("Thank You!");
					break;
				case 'b':
					System.out.println("Enter the amount");
					amt = input.nextInt();
					if (balance < amt) {
						System.out.println("No Sufficient Balance");
						System.out.println("Thank You!");
					} else {
						balance -= amt;
						System.out.println("Please collect your amount");
						System.out.println("Thank You!");
					}
					break;
				case 'c':
					System.out.println("Your balance = " + balance);
					System.out.println("Thank You!");
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
				break;
			}
			case 2: {
				System.out.println("Current Account");
				System.out.println("Enter your PIN");
				int pin1 = input.nextInt();
				System.out.println("Press\na - Deposite\nb - Withdrawal\nc - Check balance");
				char choice3 = input.next().charAt(0);
				switch (choice3) {
				case 'a':
					System.out.println("Enter the amount to be Deposited");
					amt = input.nextInt();
					balance += amt;
					System.out.println("Thank You!");
					break;
				case 'b':
					System.out.println("Enter the amount");
					amt = input.nextInt();
					if (balance < amt) {
						System.out.println("No Sufficient Balance");
						System.out.println("Thank You!");
					} else {
						balance -= amt;
						System.out.println("Please collect your amount");
						System.out.println("Thank You!");
					}
					break;
				case 'c':
					System.out.println("Your balance = " + balance);
					System.out.println("Thank You!");
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
				break;
			}
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("Press\n0 - Exit\n1 - To Continue");
			int choice4 = input.nextInt();
			switch (choice4) {
			case 0:
				flag = false;
				System.out.println("Thank You!");
				continue;
			case 1:
				continue;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}
}
