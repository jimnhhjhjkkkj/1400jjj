package Ch05Operator;

import java.util.Scanner;

public class C01Basic {

	public static void main(String[] args) {
		// 산술 연산자
//		int a=10,b=3,c;
//		System.out.println("a + b = "+(a+b));
//		System.out.println("a - b = "+(a-b));
//		System.out.println("a * b = "+(a*b));
//		System.out.println("a / b = "+(a/b));		//몫 계산
//		System.out.println("a % b = "+(a%b));		//나머지 계산 %연산자 중요!
//													// 1)짝홀수 2)배수 3)끝자리 4)수 범위 제한
//		System.out.println("-a = "+(-a));			//a=-a 랑 혼동 주의!

//		//복합대입 연산자
//		int a = 10;
//		a+=10;		//a = a + 10
//		System.out.println("a : "+a);
//		a-=5;		//a = a - 5
//		System.out.println("a : "+a);
//		a*=7;		//a = a * 7
//		System.out.println("a : "+a);
//		a/=7;		//a = a / 7
//		System.out.println("a : "+a);

//		//비교연산자
//		//> >= < <= == !=
//		int a=10,b=20;
//		//System.out.println("a==b?"+(a=b));
//		System.out.println("a==b?"+(a==b));
//		System.out.println("a>=b?"+(a>=b));
//		System.out.println("a<=b?"+(a<=b));
//		System.out.println("a>b?"+(a>b));
//		System.out.println("a<b?"+(a<b));
//		System.out.println("a!=b?"+(a!=b));
		
		//논리연산자
		//and 연산자(&&) : 둘다 참이면 참(true) 반환
		//or 연산자(||)  : 둘중 하나라도 참(ture)이면 참(true) 반환
		//! 부정연산자 : ture인 경우 false반환, false인 경우 true 반환
		
//		System.out.println("true && ture ? "+ (true&&true));
//		System.out.println("false && ture ? "+ (false&&true));
//		System.out.println("true && false ? "+ (true&&false));
//		System.out.println("false && false ? "+ (false&&false));
//		
//		int a=10,b=20,c=15;
//		System.out.println("true && ture ? "+ (a>=b&&a>=c));
//		System.out.println("false && ture ? "+ (b>=c&&b>=a));
//		System.out.println("true && false ? "+ (true&&false));
//		System.out.println("false && false ? "+ (false&&false));
		
//		System.out.println("true || ture ? "+ (true||true));
//		System.out.println("false || ture ? "+ (false||true));
//		System.out.println("true || false ? "+ (true||false));
//		System.out.println("false || false ? "+ (false||false));
		
//		boolean flag = treu;
//		System.out.println(!flag);
		
		//증감연산자(++,--)
		//전치연산자 : ++a, --a	//1증가, 1감소	변수 안의 값을 먼저 증가(or감소) 후 다른 연산처리
		//후치연산자 : a++, a-- 	//1증가, 1감소	다른 연산처리 머저 한 다음 1증가(or 감소)
		
//		int a=10,b=20,c,d;
//		c=--a + b--;
//		d=a-- + --b;
//		System.out.printf("%d %d %d %d\n", a,b,c,d);
		
		//상항연산자
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		char grade = (score>90)? 'A':'B';
		System.out.println("grade : "+grade);


	}

}
