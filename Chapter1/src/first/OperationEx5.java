package first;

public class OperationEx5 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;

		int result = num1 | num2;
		System.out.println(result);

		int num3 = 5; // 00000101
		System.out.println(num3 << 1);
		System.out.println(num3);
		System.out.println(num3 << 2); // 2의 2승으로 4곱하기
		System.out.println(num3 << 3); // 2의 3승으로 8곱하기 =>40

		System.out.println(num3 >> 1); // 00000010 //나누기 2한 것과 같음
	}

}
