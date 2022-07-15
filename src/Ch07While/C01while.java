package Ch07While;

import java.util.Scanner;

public class C01while {

	public static void main(String[] args) {
		
		//기본
		//1 탈출용 변수 지정
		//2 탈출용 조건식
		//3 조건식이 false가 되도록 하는 연산식
		
//		int i = 1;	//1 탈출용 변수
//		while(i <= 10) {	//탈출용 조건식
//			System.out.println("Hello World!");
//			i++;	//3 조건식이 거짓이 되기 위한 연산식
//		}
		
		//02 1부터 10까지 합 구하기
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
		
		//문제
		//정수값 하나(N)을 입력받아
		//1부터 N까지의 합을 구합니다
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i <= num) {
//			sum = i + sum;
//			i++;
//		}
//		System.out.println(sum);
		
		
		//문제
		//정수값 두개(N,M)을 입력받아
		//N부터 M까지의 합을 구합니다
//		
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int sum = 0;
//		while(num1 <= num2) {
//			sum = num1 + sum;
//			num1++;
//		}
//		System.out.println(sum);
		
		//2단 구구단
//		int i=1;
//		while (i<=9) {
//			System.out.printf("%d x %d = %d\n", 2,i,2*i);
//			i++;
//		}
		
		//2단 역순
//		int i=9;
//		while (i>=1) {
//			System.out.printf("%d x %d = %d\n", 2,i,2*i);
//			i--;
//		}
		
		//N단 역순
//		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
//		int i = 9;
//		while (i>=1) {
//			System.out.printf("%d x %d = %d\n", num,i,num*i);
//			i--;
//		}
		
		//문제
		//1부터 N까지 수중에
		//3의 배수의 합만 구하세요
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i<=num) {
			if (i%3==0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
		
	}

}
