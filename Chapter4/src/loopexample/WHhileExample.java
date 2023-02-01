package loopexample;

public class WHhileExample {

	public static void main(String[] args) {
		int num =1;
		int sum = 0;
		
		while(num <=  10){//num 값이 10보다 작거나 같을 동안
			sum += num; //sum = sum + num; sum초기화 해주기, 합계를 뜻하는 sum에 num을 더하고
			num++; //num에 1씩 더해 나감
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}
}
