
public class Prime {

	public static void main(String[] args) {
		int temp = 0;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i-1; j++) {
				if (i % j == 0)
					temp += 1;
			}
			if (temp == 0)
				System.out.println(i);
			else
				temp = 0;
		}

	}

}
