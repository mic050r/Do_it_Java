package first;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;

		boolean value = (((num1 = num1 + 10) < 10) && ((i = i + 2) < 10));
		// false라서 뒤를 볼 필요가 없다. 뒤를 연산안해도 됨
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 증가 안됨(2) true라면 뒤를 연산함(4)

	}

}
