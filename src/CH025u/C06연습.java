package CH025u;

public class C06연습 {

	public static void main(String[] args) {
		
//		4byte정수공간에 a라는 이름을 부여 한다음 5라는 값을 a공간에 대입
//		
//		2byte 음수를 지우너하는 공간에 b라는 이름을 부여함과 동시에 100이라는 값을 초기화
//		
//		4byte result 라는 공간에 a안의 값과 b안의 값의 합을 초기값을 대입 result 안의 값을 println하시오
		
		int a;
		a=5;
		
		short b = 100;
		
		int result = a + b;

		System.out.println(result);
	}

}
