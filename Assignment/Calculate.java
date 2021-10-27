package Assignment;

public class Calculate {
	public int calculatesum(int num) {
		int cal = 0;
		for (int i = 1; i <= num; i++) {
			if ((i % 3 == 0) || (i % 5 == 0))
				cal += i;
		}
		return cal;
	}
}
