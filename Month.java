import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month");
		String str = input.next();
		str = str.toLowerCase();
		
		if(str.equals("january") || str.equals("march") || str.equals("may") ||
				str.equals("july") || str.equals("august") || str.equals("october") ||
				str.equals("december")) {
			System.out.println("Month has 31 days");
		}
		else if(str.equals("february")) {
			System.out.println("Month has 28 or 29 days");
		}
		else {
			System.out.println("Month has 30 days");
		}
	}

}
