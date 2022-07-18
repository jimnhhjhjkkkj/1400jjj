package Ch07While;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		//w전체 구구단 출력(2-9단)
		
//		int i = 1;
//		int num = 2;
//		while (num <=9) {
//			while(i<=9) {
//				System.out.printf("%d x %d = %d / ", num,i,num*i);
//				i++;
//			}
//			num++;
//			i=1;
//			System.out.println();
//		}
		
//		int i = 9;
//		int num = 2;
//		while (num<=9) {
//			while(i>=1) {
//				System.out.printf("%d x %d = %d / ", num,i,num*i);
//				i--;
//			}
//			num++;
//			i=9;
//			System.out.println();
//		}
		
//		int i = 9;
//		int num = 9;
//		while (num>=2) {
//			while(i>=1) {
//				System.out.printf("%d x %d = %d / ", num,i,num*i);
//				i--;
//			}
//			num--;
//			i=9;
//			System.out.println();
//		}

		//별찍기
		//*****
		//*****
		//*****
		//*****
		//*****
//		int i=1;
//		while(i<=5) {
//			System.out.println("*****");
//			i++;
//		}

		//*
		//**
		//***
		//****
//		int p=1;
//		int q=1;
//		while(p<5) {
//			q = 1;
//			while(q<=p) {
//				System.out.print("*");
//				q++;
//			}
//			p++;
//			System.out.println();
//		}

		//****
		//***
		//**
		//*
		
		
//		int p=1;
//		int q=5;
//		while(p<5) {
//			q = 5;
//			while(q>p) {
//				System.out.print("*");
//				q--;
//			}
//			p++;
//			System.out.println();
//		}
		

		//   *
		//  ***
		// *****
		//*******
		
//		int p=1;
//		int q=1;
//		int r=4;
//		while(p<5) {
//			q = 1;
//			r = 4;
//			while(r>p) {
//				System.out.print(" ");
//				r--;
//			}
//			while(q<=(2*p-1)) {
//				System.out.print("*");
//				q++;
//			}
//			p++;
//			System.out.println();
//		}
		
		
		//*******
		// *****
		//  ***
		//   *
		
		
		int p=1;
		int q=5;
		int r=1;
		while(p<5) {
			q = 7;
			r = 1;
			while(r<p) {
				System.out.print(" ");
				r++;
			}
			while(q>=(2*p-1)) {
				System.out.print("*");
				q--;
			}
			p++;
			System.out.println();
		}
		
		
		//문제
		//다이아몬드모양 출력
		//모래시계모양 출력
		//높이 입력받아 출력하는 직각 삼각형
		//높이 입력받아 출력하는 직각 역삼각형
		//높이 입력받아 출력하는 정삼각형
		//높이 입력받아 출력하는 역삼각형
		//높이 입력받아 출력하는 다이아몬드
		//높이 입력받아 출력하는 모래시계
		
		
		
	}

}
