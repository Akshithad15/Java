
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13,45,79};
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 1 ; j <= 10 ; j++) {
				int mul = arr[i] * j;
				System.out.println(arr[i]+" * "+j+" = "+mul);
			}
			System.out.println();
		}
	}

}
