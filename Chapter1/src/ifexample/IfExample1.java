package ifexample;

public class IfExample1 {

	public static void main(String[] args) {
		int age = 12;
		if (age >= 8) {
			System.out.println("학교에 다닙니다."); // 수행문이 하나만 있으면 {}안 써도 됨
			System.out.println("test");
		} else {
			System.out.println("학교에 다니지 않습니다");
		}
	}

}
