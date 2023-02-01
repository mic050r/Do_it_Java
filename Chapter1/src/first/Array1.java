package first;

public class Array1 {

	public static void main(String[] args) {
		int n[] = new int[10];
		int sum = 0;

		System.out.println("초기화된 배열요소");
		for (int i = 0; i < n.length; i++) {
			n[i] = i + 1;
			System.out.print(n[i] + " ");
		}

		System.out.println(" ");

		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		System.out.println("배열요소의 합 : " + sum);
	}

}
